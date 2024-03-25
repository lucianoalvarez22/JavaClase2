package sockets.hilos;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTCP {
	
private ServerSocket serverSocket;
	
	public ServerSocketTCP(int puerto) throws IOException {
		serverSocket = new ServerSocket(puerto);
		
		while(true) {
			Socket socket = serverSocket.accept();
			System.out.println("(Server) Conexion establecida.");
			new GestorDeProcesos(socket).start();
			
		}
	}
	
	
	public void stop() throws IOException {
		serverSocket.close();  
	}
	
	
	public static void main(String[] args) {
		
		
		try {
			ServerSocketTCP servidor = new ServerSocketTCP(49171);
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
