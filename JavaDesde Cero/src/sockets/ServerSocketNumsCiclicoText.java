package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketNumsCiclicoText {
	
	private ServerSocket serverSocket;
	private Socket socket;
	private InputStream is;
	private OutputStream os;
	
	//Añadiendo nuevas propiedas para soportar Texto en la comunicación
	//El prinbWriter Tiene un constrauctor que le pasas un OutpoStream 
	private PrintWriter pw;
	
	private InputStreamReader isr;
	private BufferedReader br;
	
	
	//CONSTRUCTOR QUE DADO UN PUERTO MEDIANTE UN OBJETO PONE A BUSCAR 
	public ServerSocketNumsCiclicoText(int puerto) throws IOException {
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
	
	public void abrirCanalesTexto() {
		System.out.println("(Servidor) Abriendo canales de texto...");
		pw = new PrintWriter(os, true); //Para que haga autoflush
		isr = new InputStreamReader(is);
		br = new BufferedReader(isr);
		System.out.println("(Servidor) Canales de textos abiertos");
	}
	
	
	
	public void cerrarCanalesTexto() throws IOException {
		System.out.println("(Servidor) Cerrando canales de texto...");
		pw.close();
		br.close();
		isr.close();
		
		System.out.println("(Servidor) Canales de textos cerrados");
		
	}
	
	
	public static void main(String[] args) {
		//lo declaro fuera por si quiero coger luego esa variable
		ServerSocketNumsCiclicoText server;
		
		//TENEMOS EL PUERTO 8081
		try {
			server = new ServerSocketNumsCiclicoText(8081);
			server.start();
			
			server.abrirCanalesTexto();
			
			while(true) {
				String datoLeido = server.br.readLine();
				
				System.out.printf("Servidor Leido: %s%n", datoLeido);
				
				if(datoLeido == null) break;
				
				String datoAEnviar = datoLeido.toUpperCase();
				server.pw.println(datoAEnviar);
				
				System.out.printf("Servidor Enviado: %s%n", datoAEnviar);
				
				
			}
			server.cerrarCanalesTexto();
			server.stop();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	

}
