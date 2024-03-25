package socketsRubrica;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {

    private static final int PORT = 12345;
    private static List<ClientHandler> clients = new ArrayList<>();

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Server listening on port " + PORT);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected");

                ClientHandler clientHandler = new ClientHandler(clientSocket);
                clients.add(clientHandler);
                clientHandler.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized void removeClient(ClientHandler client) {
        clients.remove(client);
    }

    public static synchronized void broadcastMessage(String message, ClientHandler excludeClient) {
        for (ClientHandler client : clients) {
            if (client != excludeClient) {
                client.sendMessage(message);
            }
        }
    }
}

class ClientHandler extends Thread {
    private Socket clientSocket;
    private PrintWriter out;

    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }

    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            out = new PrintWriter(clientSocket.getOutputStream(), true);

            String username = in.readLine();
            System.out.println(username + " has joined the chat");

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                ChatServer.broadcastMessage(username + ": " + inputLine, this);
            }

            System.out.println(username + " has left the chat");

            // Remove client from the list
            ChatServer.removeClient(this);
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String message) {
        out.println(message);
    }
}
