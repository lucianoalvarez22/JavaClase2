package sockets.hilos;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClienteTCPSocket {

	private InputStream is;
	private Socket socket;
	String serverIp;
	int serverPort;

	public ClienteTCPSocket(String serverIp, int serverPort) {
		this.serverIp = serverIp;
		this.serverPort = serverPort;
	}

	public void start() throws IOException {

		System.out.println("(Cliente) Lanzando petición socket...");
		// Esto es poner a dar vueltas la rueda buscando una conexion
		socket = new Socket(serverIp, serverPort);

		System.out.printf("(Cliente-%s:%d) Peticion lanzada y aceptada...%n", serverIp, serverPort);
		// Establece conexion y podemos enviar y recibir información
		// Con esto obtenemos el InputStream y el OutputStream
		is = socket.getInputStream();
	}

	public void stop() throws IOException {
		System.out.printf("(Cliente-%s:%d) Conexion socket cerrandose...%n", serverIp, serverPort);
		is.close();
		socket.close();

		System.out.printf("(Cliente-%s:%d) Conexion socket cerrada.%n", serverIp,serverPort);

	}
	
	public static void main(String[] args) {
		ClienteTCPSocket cliente = new ClienteTCPSocket("localhost", 49170);
		
		try {
			cliente.start();
			int datosRecibidos = cliente.is.read();
			System.out.printf("[Cliente %s:%d] Mensaje recibido: %d%n", cliente.serverIp, cliente.serverPort, datosRecibidos);
			
			cliente.stop();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
