package temaFicheros.ejercicioExamenFichero;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CartasExamen {

	private String[] ArrayCartaPalo = { "trebol", "picas", "diamante", "corazones" };
	private String CartaPaloAleatorio;

	private String[] ArrayCartaValor = { "JokerBYN", "JokerColor", "AS", "2", "3", "4", "5", "6", "7", "8", "9", "10",
			"J", "Q", "K" };
	private static String CartaValor;

	private int[] ArrayDadoUno = { 1, 2, 3, 4, 5, 6 };
	private int DadoUnoAleatorio;

	private int[] ArrayDadoDos = { 1, 2, 3, 4, 5, 6 };
	private int DadoDosAleatorio;

	private String[] ArrayMoneda = { "cara", "cruz" };
	private String MonedaAleatorio;

	private static List<String> listandoCartas = new ArrayList<>();
	private static List<String> ultimosLanzamientos = new ArrayList<>();

	private Random ran = new Random();

	public CartasExamen() {
		this.CartaPaloAleatorio = ArrayCartaPalo[ran.nextInt(ArrayCartaPalo.length)];
		CartaValor = ArrayCartaValor[ran.nextInt(ArrayCartaValor.length)];
		this.DadoUnoAleatorio = ArrayDadoUno[ran.nextInt(ArrayDadoUno.length)];
		this.DadoDosAleatorio = ArrayDadoDos[ran.nextInt(ArrayDadoDos.length)];
		this.MonedaAleatorio = ArrayMoneda[ran.nextInt(ArrayMoneda.length)];

	}

	private boolean verificarCartaImpar(String carta) {
		if (carta.equalsIgnoreCase("AS") || carta.equals("3") || carta.equals("5") || carta.equals("7")
				|| carta.equals("9") || carta.equalsIgnoreCase("J") || carta.equalsIgnoreCase("K")) {
			return true;
		} else {
			try {
				int cartaNumero = Integer.parseInt(carta);
				return cartaNumero % 2 != 0;
			} catch (NumberFormatException e) {
				// Excepcion para manejar el caso en que el valor no sea numérico
				return false;
			}
		}

	}

	private boolean verificarCartaFiguras(String cartaFigura) {
		if (cartaFigura.equalsIgnoreCase("AS") || cartaFigura.equalsIgnoreCase("J") || cartaFigura.equalsIgnoreCase("Q")
				|| cartaFigura.equalsIgnoreCase("K") || cartaFigura.equalsIgnoreCase("JokerBYN")
				|| cartaFigura.equalsIgnoreCase("JokerColor")) {
			return true;

		} else {
			return false;
		}
	}

	public static void escribirFicheroCartasAleatorio() {
		try (BufferedWriter escrituraFicheroAleatorio = new BufferedWriter(
				new FileWriter("C:\\Users\\Luciano\\Documents\\PruebaArchivo\\lanzamientos.txt"));
				BufferedWriter escrituraFicherosDescartes = new BufferedWriter(
						new FileWriter("C:\\Users\\Luciano\\Documents\\PruebaArchivo\\lanzamientosdescartes.txt"))) {

			for (int i = 0; i < 400; i++) {

				CartasExamen c1 = new CartasExamen();

				if ((c1.DadoUnoAleatorio % 2 != 0 || c1.DadoDosAleatorio % 2 != 0) && c1.MonedaAleatorio.equals("cruz")
						&& c1.CartaPaloAleatorio.equals("trebol") && c1.verificarCartaImpar(CartaValor) 
						|| c1.DadoUnoAleatorio + c1.DadoDosAleatorio == 7 && c1.MonedaAleatorio.equals("cara")
								&& c1.verificarCartaFiguras(CartaValor)) {

					escrituraFicherosDescartes.append(c1.DadoUnoAleatorio + "|" + +c1.DadoDosAleatorio + "|"
							+ c1.MonedaAleatorio + "|" + c1.CartaPaloAleatorio + "|" + CartasExamen.CartaValor + "\n");
				} else {

					escrituraFicheroAleatorio.append(c1.DadoUnoAleatorio + "|" + c1.DadoDosAleatorio + "|"
							+ c1.MonedaAleatorio + "|" + c1.CartaPaloAleatorio + "|" + CartasExamen.CartaValor + "\n");

				}
			}

		} catch (IOException e) {
			System.out.println("No se pudo escribir el fichero" + e);
		}
	}

	public static void leerFicheroCartas() {
		try (BufferedReader leerFicheroCartas = new BufferedReader(
				new FileReader("C:\\Users\\Luciano\\Documents\\PruebaArchivo\\lanzamientos.txt"));) {

			String lineasLeidas;

			while ((lineasLeidas = leerFicheroCartas.readLine()) != null) {
				listandoCartas.add(lineasLeidas.replace("|", " "));
			}

			System.out.println("=============Lectura de Fichero Completo===========\n");
			// Leyendo por consola
			for (String lectura : listandoCartas) {
				System.out.println(lectura);
			}

		} catch (IOException e) {
			System.out.println("No se pudo leer el fichero correctamente" + e);
		}
	}

	public static void generarNuevosFicherosSimultaneos() {

		try (BufferedWriter nuevoFicheroHTML = new BufferedWriter(
				new FileWriter("C:\\Users\\Luciano\\Documents\\PruebaArchivo\\lanzamientos.html"));
				BufferedWriter nuevoFicheroSQL = new BufferedWriter(
						new FileWriter("C:\\Users\\Luciano\\Documents\\PruebaArchivo\\lanzamientos.sql"))) {

			for (int i = listandoCartas.size() - 201; i < listandoCartas.size(); i++) {
				ultimosLanzamientos.add(listandoCartas.get(i));
			}
			
			nuevoFicheroHTML.append("<table>"
					+ "<tr>"
					+ "<th>Dado1</th>"
					+ "<th>Dado2</th>"
					+ "<th>Moneda</th>"
					+ "<th>Carta</th>"
					+ "</tr>");
			ultimosLanzamientos.stream().filter(p -> p.contains("picas") || p.contains("corazones")).forEach(t -> {
//				System.out.println(t);
				try {
					nuevoFicheroSQL
							.append("INSERT INTO CartasFiltradas (Dado1, Dado2, Moneda, Carta) VALUES (" + t + ")\n");
					
					nuevoFicheroHTML.append(
							"<tr>"
							+ "<td>" + t.split(" ")[0] + "</td>"
							+ "<td>" + t.split(" ")[1] + "</td>"
							+ "<td>" + t.split(" ")[2] + "</td>" 
							+ "<td>" + t.split(" ")[3] + ", " + t.split(" ")[4] + "</td>"
							+ "</tr>");
							
							
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
			
			nuevoFicheroHTML.append("</table>");

		} catch (IOException e) {
			System.out.println("No se pudo escribir el fichero" + e);
		}

	}

	public static void main(String[] args) {
		escribirFicheroCartasAleatorio();
//		leerFicheroCartas();
//		generarNuevosFicherosSimultaneos();
	}

}
