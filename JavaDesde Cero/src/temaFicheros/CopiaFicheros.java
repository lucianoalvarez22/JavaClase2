package temaFicheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiaFicheros {

	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("C:\\Users\\Luciano\\Documents\\PruebaArchivo\\javalogo.jpeg");
				FileOutputStream fos = new FileOutputStream("C:\\Users\\Luciano\\Documents\\PruebaArchivo\\javalogo2.jpeg");) {
			
			int b = 0;
			
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
			
			
		} catch (IOException e) {
			System.out.println("Problemas con los archivos");
		} finally {
			System.out.println("Gracias por su confianza");
		}

	}

}
