package sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Random;

public class ClientNumsNoCiclico {
	
	private Socket socket;
	private InputStream is;
	private OutputStream os;
	
	private String direccion;
	private int puerto;
	
	
	
	
	
	public ClientNumsNoCiclico(String direccion, int puerto) {
		this.direccion = direccion;
		this.puerto = puerto;
	}



	public void start() throws UnknownHostException, IOException {
		
		System.out.println("(Cliente) Lanzando petición socket...");
		//LANZA LA CONEXION Y SI EL SERVIDOR ESTÁ DANDO VUELTAS, LO PILLA
		socket = new Socket(direccion, puerto);
		
		System.out.printf("(Cliente-%s:%d) Peticion lanzada y aceptada...%n",
				direccion, puerto);
		//obtenemos los input y output
		is = socket.getInputStream();
		os = socket.getOutputStream();
	}
	
	
	
	public void stop() throws IOException {
		System.out.printf("(Cliente-%s:%d) Conexion socket cerrandose...%n",
				direccion, puerto);
		os.close();
		is.close();
		socket.close();
		
		System.out.printf("(Cliente-%s:%d) Conexion socket cerrada.%n",
				direccion, puerto);
		
	}
	
	public static void main(String[] args) {
		ClientNumsNoCiclico cliente = new ClientNumsNoCiclico("localhost", 8081);
		
		//EL CLIENTE ENGANCHA CON EL SERVER
		try {
			cliente.start();
			//Y AQUI LE MANDA UN DATO 
			int datoEnviado = new Random().nextInt(255);
			
			System.out.printf("(Cliente-%s:%d) Enviadndo: %d%n",
					cliente.direccion, cliente.puerto, datoEnviado);
			
			cliente.os.write(datoEnviado);
			
			
			int datoRecibido = cliente.is.read();
			System.out.printf("(Cliente-%s:%d) Recibido: %d%n",
					cliente.direccion, cliente.puerto, datoRecibido);
			cliente.stop();
			
		} catch (UnknownHostException e) {

			e.printStackTrace();
		} catch (IOException e) {
	
			e.printStackTrace();
		}
		
		
		
		
	}
	

}
