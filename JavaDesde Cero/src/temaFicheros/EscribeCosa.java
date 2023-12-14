package temaFicheros;

import java.io.FileWriter;
import java.io.IOException;

public class EscribeCosa {

	public static void main(String[] args) {

		int numElem = 10;
		try (FileWriter ficheroEscrito = new FileWriter("src\\temaFicheros\\archivoCosas.txt");) {
			for (int i = 0; i < numElem; i++) {
				ficheroEscrito.append(new EjercicioCosa().datosFormateados());
				if (i % numElem / 10 == 0) ficheroEscrito.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Escritura realizada con éxito");
		}

	}

}
