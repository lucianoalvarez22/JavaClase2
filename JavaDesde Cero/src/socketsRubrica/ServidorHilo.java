package socketsRubrica;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServidorHilo extends Thread {

	private DataInputStream in;
	private DataOutputStream out;
	private String nombreCliente;

	public ServidorHilo(DataInputStream in, DataOutputStream out, String nombreCliente) {
		this.in = in;
		this.out = out;
		this.nombreCliente = nombreCliente;
	}

	@Override
	public void run() {

		int opcion;
		File f = new File("numeros.txt");

		while (true) {

			try {
				opcion = in.readInt();
				switch (opcion) {
				case 1:
					// Recibo el numero aleatorio del ClienteHilo
					int numeroAleatorio = in.readInt();
					// escribo el numero
					escribirNumeroAleatorio(f, numeroAleatorio);
					System.out.println("Se escribio el numero en el cliente: " + nombreCliente);
					// Mando el mensaje de confirmacion al cliente
					out.writeUTF("Numero guardado correctamente");
					break;

				case 2:
					break;

				case 3:
					break;

				case 4:
					break;

				case 5:
					break;

				case 6:
					break;
				default:
					out.writeUTF("Solo numero del ....");
				}

			} catch (IOException ex) {
				Logger.getLogger(ServidorHilo.class.getName()).log(Level.SEVERE, null, ex);
			}

		}

	}

	public void escribirNumeroAleatorio(File f, int numeroAleatorio) throws IOException {

		FileWriter fw = new FileWriter(f, true);
		fw.write(nombreCliente + ":"+ numeroAleatorio + "\r\n");
		fw.close();

	}

}
