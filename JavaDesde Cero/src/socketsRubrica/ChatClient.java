package socketsRubrica;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int PORT = 12345;

    public static void main(String[] args) {
        try {
            Socket socket = new Socket(SERVER_ADDRESS, PORT);
            System.out.println("Connected to the chat server");

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            System.out.print("Enter your username: ");
            String username = userInput.readLine();
            out.println(username);

            // Thread to continuously read user input and send messages to the server
            Thread messageSender = new Thread(() -> {
                try {
                    String userInputMessage;
                    while ((userInputMessage = userInput.readLine()) != null) {
                        out.println(username + ": " + userInputMessage);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            messageSender.start();

            // Thread to continuously receive messages from the server and print them to console
            Thread messageReceiver = new Thread(() -> {
                try {
                    String message;
                    while ((message = in.readLine()) != null) {
                        System.out.println(message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            messageReceiver.start();

            // Wait for both threads to finish
            messageSender.join();
            messageReceiver.join();

            // Close resources
            socket.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
