package temaFicheros.ejercicioExamenFichero;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GeneraArchivoExamenPOO {
	private static List<LanzamientoCartaExamenPOO> l1 = new ArrayList<>();

	private static Predicate<LanzamientoCartaExamenPOO> lanzamientosValidos = t -> ((t.getDadoUnoAleatorio() % 2 != 0
			|| t.getDadoDosAleatorio() % 2 != 0) && t.getMonedaAleatorio().equals("cruz")
			&& t.getCartaPaloAleatorio().equals("trebol")
			&& (t.getCartaValor().equals("AS") || t.getCartaValor().equals("3") || t.getCartaValor().equals("5")
					|| t.getCartaValor().equals("7") || t.getCartaValor().equals("9") || t.getCartaValor().equals("J")
					|| t.getCartaValor().equals("K"))
			|| t.getDadoUnoAleatorio() + t.getDadoDosAleatorio() == 7 && t.getMonedaAleatorio().equals("cara")
					&& (t.getCartaValor() == "AS" || t.getCartaValor() == "J" || t.getCartaValor() == "Q"
							|| t.getCartaValor() == "K"));

	
	
	public static void generandoListado() {
		for (int i = 0; i < 10000; i++) {
			l1.add(new LanzamientoCartaExamenPOO());
		}
	}

	
	public static void escribirFicheroPOO() {
		generandoListado();
		try (BufferedWriter escrituraFicheroPOO = new BufferedWriter(
				new FileWriter("C:\\Users\\Luciano\\Documents\\PruebaArchivo\\lanzamientosPOO.txt"));) {

			l1.stream().filter(lanzamientosValidos.negate()).forEach(t -> {

				try {
					escrituraFicheroPOO.append(t.toString() + "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			});

		} catch (IOException e) {
			System.out.println("No se pudo escribir el fichero" + e);
		}

	}

}
