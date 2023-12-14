package temaFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class EjercicioPersonaBuffer {

	// ATRIBUTOS
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int anyoNacido;
	private static String[] ArrayNombres;
	private static String[] ArrayApellidos1;
	private static Random ran = new Random();
	

	// CONSTRUCTOR
	public EjercicioPersonaBuffer() {
		this.nombre = ArrayNombres[ran.nextInt(ArrayNombres.length)];
		this.apellido1 = ArrayApellidos1[ran.nextInt(ArrayApellidos1.length)];
		this.apellido2 = ArrayApellidos1[ran.nextInt(ArrayApellidos1.length)];
		this.anyoNacido = ran.nextInt(1920,2024);
	}

	public static void leerFichero() {

		try (BufferedReader bufReadPersonas = new BufferedReader(
				new FileReader("C:\\Users\\Luciano\\Documents\\PruebaArchivo\\nombres.txt"));
				BufferedReader bufReadApellidos = new BufferedReader(
						new FileReader("C:\\Users\\Luciano\\Documents\\PruebaArchivo\\apellidos.txt"));) {

			String lineas = "";
			while ((lineas = bufReadPersonas.readLine()) != null) {
				ArrayNombres = lineas.split(",");
			}

			while ((lineas = bufReadApellidos.readLine()) != null) {
				ArrayApellidos1 = lineas.split(",");
			}

			for (int i = 0; i < ArrayNombres.length; i++) {
				ArrayNombres[i] = ArrayNombres[i].trim();
				System.out.println(ArrayNombres[i]);
			}

			for (int i = 0; i < ArrayApellidos1.length; i++) {
				ArrayApellidos1[i] = ArrayApellidos1[i].trim();
				System.out.println(ArrayApellidos1[i]); 
			}

			// FOR EACH
//			for(String nom : ArrayNombres) {
//				System.out.println(nom);
//			}
//			
//			for(String apel : ArrayApellidos1) {
//				System.out.println(apel);
//			}

		} catch (IOException e) {
			System.out.println("Problema con la lectura de los ficheros");
		}

	}

	public static void EscribirFichero() {

		try (BufferedWriter bufWrSQL = new BufferedWriter(
				new FileWriter("C:\\Users\\Luciano\\Documents\\PruebaArchivo\\archivoSQL.sql"));) {
			
			for(int i=0; i<100; i++){
				EjercicioPersonaBuffer p1 = new EjercicioPersonaBuffer();
				bufWrSQL.append(" INSERT INTO personas (Nombre, Apellido, anyoNacimiento) VALUES (" + p1.nombre + "," + p1.apellido1 + "," + p1.anyoNacido + ") \n");
			}

		} catch (IOException e) {
			System.out.println("Fichero no leído");
		}

	}

	public static void main(String[] args) {
		leerFichero();
		//EscribirFichero();

	}

}
