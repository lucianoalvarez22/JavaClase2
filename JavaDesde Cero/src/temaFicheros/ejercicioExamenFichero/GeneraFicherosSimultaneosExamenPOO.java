package temaFicheros.ejercicioExamenFichero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeneraFicherosSimultaneosExamenPOO {

	private static List<String> listandoCartasPOO = new ArrayList<>();

	public static void leerFicheroPOO() {
		try (BufferedReader leerFicheroCartasPOO = new BufferedReader(
				new FileReader("C:\\Users\\Luciano\\Documents\\PruebaArchivo\\lanzamientosPOO.txt"));) {

			String lineasLeidas;

			while ((lineasLeidas = leerFicheroCartasPOO.readLine()) != null) {
				listandoCartasPOO.add(lineasLeidas.replace("|", " "));
			}

			System.out.println("=============Lectura de Fichero Completo===========\n");
			for (String lectura : listandoCartasPOO) {
				System.out.println(lectura);
			}

		} catch (IOException e) {
			System.out.println("No se pudo leer el fichero correctamente" + e);
		}

	}

	
	
	public static void generarNuevosFicherosSimultaneosPOO() {

		try (BufferedWriter nuevoFicheroHTMLPOO = new BufferedWriter(
				new FileWriter("C:\\Users\\Luciano\\Documents\\PruebaArchivo\\lanzamientosHTMLPOO.html"));
				BufferedWriter nuevoFicheroSQLPOO = new BufferedWriter(
						new FileWriter("C:\\Users\\Luciano\\Documents\\PruebaArchivo\\lanzamientosSQLPOO.sql"))) {
			
			nuevoFicheroHTMLPOO.append("<!DOCTYPE html>\n" +
	                "<html>\n" +
	                "<head>\n" +
	                "  <title>EjercicioExamenLucianoAlvarez</title>\n" +
	                "</head>\n" +
	                "<body>\n" +
	                "\n" +
	                "<h2>Lanzamiento de Cartas</h2>\n" +
	                "\n" +
	                "<table border=\"1\">\n" +
	                "  <tr>\n" +
	                "    <th>Dado 1</th>\n" +
	                "    <th>Dado 2</th>\n" +
	                "    <th>Moneda</th>\n" +
	                "    <th>Palo</th>\n" +
	                "    <th>Valor</th>\n" +
	                "  </tr>\n");
			Collections.reverse(listandoCartasPOO);
			listandoCartasPOO.stream().filter(p -> p.contains("picas") || p.contains("corazones")).limit(200).forEach(t -> {
				try {
					nuevoFicheroSQLPOO.append("INSERT INTO LanzamientosCartasFiltradas (Dado1, Dado2, Moneda, CartaValor, CartaPalo) VALUES (" + "'"
							+ t.split(" ")[0] + "'," + "'" + t.split(" ")[1] + "'," + "'" + t.split(" ")[2] + "',"
							+ "'" + t.split(" ")[3] + "'," + "'" + t.split(" ")[4] + "'" + ");\n");
					
					nuevoFicheroHTMLPOO.append(
							 "  <tr>\n" +
		                                "<td>" + t.split(" ")[0] + "</td>\n" +
		 
		                                "    <td>" + t.split(" ")[0] + "</td>\n" +
		                                "    <td>" + t.split(" ")[1] + "</td>\n" +
		                                "    <td>" + t.split(" ")[2] + "</td>\n" +
		                                "    <td>" + t.split(" ")[3] + ", " + t.split(" ")[4] + "</td>\n" +
		                                "  </tr>\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
			
			nuevoFicheroHTMLPOO.append("</table>");

		} catch (IOException e) {
			System.out.println("No se pudo escribir el fichero" + e);
		}

	}

}
