package sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketNumsNoCiclico {
	
	private ServerSocket serverSocket;
	private Socket socket;
	private InputStream is;
	private OutputStream os; 
	
	
	//CONSTRUCTOR QUE DADO UN PUERTO MEDIANTE UN OBJETO PONE A BUSCAR 
	public ServerSocketNumsNoCiclico(int puerto) throws IOException {
		serverSocket = new ServerSocket(puerto);
	}
	
	//NECESITAMOS UN START Y UN STOP PARA SABER CUANDO LANZAR LA PETICION Y CUANDO PARARLO
	public void start() throws IOException {
		
		System.out.println("(Servidor) Esperando conexion...");
		//Esto es poner a dar vueltas la rueda buscando una conexion 
		socket = serverSocket.accept();
		
		System.out.println("(Servidor) conexión establecida...");
		//Establece conexion y podemos enviar y recibir información
		//Con esto obtenemos el InputStream y el OutputStream
		is = socket.getInputStream();
		os = socket.getOutputStream();
	}
	
	
	public void stop() throws IOException {
		
		System.out.println("(Servidor) Cerrando conexion...");
		//Cerramos primero el IS y el OS
		is.close();
		os.close();
		
		//Corto la linea del socket
		socket.close();
		
		//Ya no se le puede enviar sockets
		serverSocket.close();
		
		
	}
	
	
	public static void main(String[] args) {
		//lo declaro fuera por si quiero coger luego esa variable
		ServerSocketNumsNoCiclico server;
		
		//TENEMOS EL PUERTO 8081
		try {
			server = new ServerSocketNumsNoCiclico(8081);
			server.start();
			
			//LEO EL DATO Y LO GUARDO EN DATO LEIDO
			int datoLeido = server.is.read();
			
			System.out.printf("Servidor Leido: %d%n", datoLeido); 
			
			
			//LE SUMO UNO AL DATO LEIDO PARA ENVIARLO
			int datoAEnviar = datoLeido + 1;
			
			//ESCRIBO EL DATO NUMERICO
			server.os.write(datoAEnviar);
			System.out.printf("Servidor Enviado: %d%n", datoAEnviar);
			
			server.stop();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	

}
