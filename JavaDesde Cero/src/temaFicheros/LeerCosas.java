package temaFicheros;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeerCosas {

//	public static void main(String[] args) {

//		File ficherin = new File("src\\temaFicheros\\archivoCosas.txt");
//		
//		try (FileReader archivoLeidos = new FileReader(ficherin);) {
//			int caracteresArchivo = 0;
//			
//			do {
//				caracteresArchivo = archivoLeidos.read();
//				System.out.print((char)caracteresArchivo);
//			} while(caracteresArchivo != -1);
//			
//		} catch (IOException e) { 
//			System.out.println("Error al leer archivo");
//		} finally {
//			System.out.println("\nArchivo leido correctamente");
//		}

	public static void main(String[] args) {
		String fileString = "";
		try (FileReader ficheroLeer = new FileReader("src\\temaFicheros\\archivoCosas.txt");) {
			int c = 0;

			while ((c = ficheroLeer.read()) != -1) {
				fileString += (char) c;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Escritura realizada con éxito");
		}

		List<EjercicioCosa> cosas = new ArrayList<>();

		for (String s : fileString.split("\n")) {

			cosas.add(new EjercicioCosa(Integer.parseInt(s.split(",")[0]), s.split(",")[1].charAt(0)));
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(cosas.get(i).datosFormateados());
		}

		System.out.printf("Número de cosas: %d", cosas.size());

	}
}
