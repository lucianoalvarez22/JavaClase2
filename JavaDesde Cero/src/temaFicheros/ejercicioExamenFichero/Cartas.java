package temaFicheros.ejercicioExamenFichero;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cartas {

	private static String[] Arraypalo = { "picas", "tréboles", "corazones", "diamantes" };
	private String paloAleatorio;

	private static String[] Arrayvalor = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	private String valorAleatorio;

	private static String[] Arraycolor = { "rojo", "azul" };
	private String colorAleatorio;

	private static List<String> listaCartas = new ArrayList<>();
	
	
	private Random ran = new Random();

	public Cartas() {
		this.paloAleatorio = Arraypalo[ran.nextInt(Arraypalo.length)];
		this.valorAleatorio = Arrayvalor[ran.nextInt(Arrayvalor.length)];
		this.colorAleatorio = Arraycolor[ran.nextInt(Arraycolor.length)];
	}
	
	

	public static void escribirFicheroAleatorios() {
		try (BufferedWriter escrituraFichero = new BufferedWriter(
				new FileWriter("C:\\Users\\Luciano\\Documents\\PruebaArchivo\\archivo.txt"));) {

			for (int i = 0; i < 10; i++) {
				Cartas c1 = new Cartas();
				escrituraFichero
						.append(c1.paloAleatorio + "|" + c1.valorAleatorio + "|" + c1.colorAleatorio + "\n");
			}

		} catch (IOException e) {
			System.out.println("No se pudo escribir el fichero" + e);
		}

	}
	
	public static void escribirFicheroFiltrado() {
		try (BufferedWriter ficheroFiltrado = new BufferedWriter(
				new FileWriter("C:\\Users\\Luciano\\Documents\\PruebaArchivo\\archivoCartasSQL.sql"));) {
			listaCartas.stream().filter(s -> s.contains("rojo")).forEach(t -> {
				try {
					ficheroFiltrado.append(" INSERT INTO Cartas (Palo, Valor, Color) VALUES (" + t + ")\n"); 
				} catch (IOException e) {
					e.printStackTrace(); 
				}
			}); 

		} catch (IOException e) {
			System.out.println("No se pudo escribir el fichero" + e);
		}
		
	}

	public static void leerFichero() {

		try (BufferedReader leerFicheroBuffer = new BufferedReader(
				new FileReader("C:\\Users\\Luciano\\Documents\\PruebaArchivo\\archivo.txt"));) {

			String lineasLeidas;

			while ((lineasLeidas = leerFicheroBuffer.readLine()) != null) {
				Cartas.listaCartas.add(lineasLeidas.replace("|", " "));
			}	
			

		} catch (IOException e) {
			System.out.println("No se pudo leer el fichero correctamente" + e);
		}
	}

	public static void main(String[] args) {

		//escribirFicheroAleatorios();
//		leerFichero();
//		escribirFicheroFiltrado();

	}

}
