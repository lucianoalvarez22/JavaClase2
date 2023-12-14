package temaFicheros;

import java.io.File;

public class EjemploFichero {

	public static void main(String[] args) {
		
		File f1 = new File("C:\\Users\\Luciano\\Documents");
		File f2 = new File("C:\\Users\\Luciano\\Documents\\er");
		System.out.println(f1.exists());
		System.out.println(f2.exists());
		

	}

}
