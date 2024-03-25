package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientNumsCiclicoText {

	private Socket socket;
	private InputStream is;
	private OutputStream os;

	private String direccion;
	private int puerto;

	private PrintWriter pw;

	private InputStreamReader isr;
	private BufferedReader br;

	public ClientNumsCiclicoText(String direccion, int puerto) {
		this.direccion = direccion;
		this.puerto = puerto;
	}

	public void start() throws UnknownHostException, IOException {

		System.out.println("(Cliente) Lanzando petición socket...");
		// LANZA LA CONEXION Y SI EL SERVIDOR ESTÁ DANDO VUELTAS, LO PILLA
		socket = new Socket(direccion, puerto);

		System.out.printf("(Cliente-%s:%d) Peticion lanzada y aceptada...%n", direccion, puerto);
		// obtenemos los input y output
		is = socket.getInputStream();
		os = socket.getOutputStream();
	}

	public void stop() throws IOException {
		System.out.printf("(Cliente-%s:%d) Conexion socket cerrandose...%n", direccion, puerto);
		os.close();
		is.close();
		socket.close();

		System.out.printf("(Cliente-%s:%d) Conexion socket cerrada.%n", direccion, puerto);

	}

	public void abrirCanalesTexto() {
		System.out.printf("(Cliente-%s:%d) Abriendo canales de texto...%n", direccion, puerto);
		pw = new PrintWriter(os, true); // Para que haga autoflush
		isr = new InputStreamReader(is);
		br = new BufferedReader(isr);
		System.out.printf("(Cliente-%s:%d) Canales de textos abiertos%n", direccion, puerto);
	}

	public void cerrarCanalesTexto() throws IOException {
		System.out.printf("(Cliente-%s:%d) Cerrando canales de texto...%n", direccion, puerto);
		pw.close();
		br.close();
		isr.close();

		System.out.printf("(Cliente-%s:%d) Canales de textos cerrados%n", direccion, puerto);

	}

//	public static void main(String[] args) {
//		ClientNumsCiclicoText cliente = new ClientNumsCiclicoText("localhost", 8081);
//
//		// EL CLIENTE ENGANCHA CON EL SERVER
//		try {
//			cliente.start();
//			cliente.abrirCanalesTexto();
//			
//			List<String> lista = new ArrayList<>();
//			lista.add("hola");
//			lista.add("adios");
//			lista.add("fin"); 
//			
//			for(int i=0; i<lista.size(); i++) {
//				String datoEnviado = lista.get(i);
//				System.out.printf("(Cliente-%s:%d) Enviadndo: %s%n", cliente.direccion, cliente.puerto, datoEnviado);
//				
//				cliente.pw.println(datoEnviado); 
//				String datoRecibido = cliente.br.readLine();
//				System.out.printf("(Cliente-%s:%d) Recibido: %s%n", cliente.direccion, cliente.puerto, datoRecibido); 
//				
//			}
//			
//			cliente.cerrarCanalesTexto();
//			cliente.stop();
//
//		} catch (UnknownHostException e) {
//
//			e.printStackTrace();
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
//
//	}

//	public static void main(String[] args) {
//		ClientNumsCiclicoText cliente = new ClientNumsCiclicoText("localhost", 8081);
//
//		// EL CLIENTE ENGANCHA CON EL SERVER
//		try {
//			cliente.start();
//			cliente.abrirCanalesTexto();
//			
//			
//			for(int i=0; i<201; i++) {
//				String datoEnviado = "<datomandado" + i + ">";
//				System.out.printf("(Cliente-%s:%d) Enviadndo: %s%n", cliente.direccion, cliente.puerto, datoEnviado);
//				
//				cliente.pw.println(datoEnviado); 
//				String datoRecibido = cliente.br.readLine();
//				System.out.printf("(Cliente-%s:%d) Recibido: %s%n", cliente.direccion, cliente.puerto, datoRecibido); 
//				
//			}
//			
//			cliente.cerrarCanalesTexto();
//			cliente.stop();
//
//		} catch (UnknownHostException e) {
//
//			e.printStackTrace();
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
//
//	}

	public static void main(String[] args) {
		ClientNumsCiclicoText cliente = new ClientNumsCiclicoText("localhost", 8081);

		// EL CLIENTE ENGANCHA CON EL SERVER
		try {
			cliente.start();
			cliente.abrirCanalesTexto();

			Scanner scanner = new Scanner(System.in);

			// Pedir al usuario que introduzca un texto
			System.out.print("Introduce un texto: ");
			while(true) {
				String datoEnviado = scanner.nextLine();
				cliente.pw.println(datoEnviado);
				System.out.printf("(Cliente-%s:%d) Enviadndo: %s%n", cliente.direccion, cliente.puerto, datoEnviado);
				
				String datoRecibido = cliente.br.readLine();
				if(datoRecibido == null) break;
				System.out.printf("(Cliente-%s:%d) Recibido: %s%n", cliente.direccion, cliente.puerto, datoRecibido);
				
			}


			cliente.cerrarCanalesTexto();
			cliente.stop();

		} catch (UnknownHostException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
