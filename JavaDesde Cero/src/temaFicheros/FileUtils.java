package temaFicheros;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FileUtils {

	public static boolean analiza(File f) {
		if (f == null) {
			return false;
		} else if (!f.exists()) {
			System.out.println("El archivo no existe, no es un directorio o no es un archivo");
			return false;
		} else {
			System.out.printf("Lectura: %s  Escritura: %s Ejecucion: %s Parent: %s Name: %s\n", f.canRead(),
					f.canWrite(), f.canExecute(), f.getParentFile(), f.getName());

			if (f.isFile()) {
				System.out.printf("El tamaño en MB es %s", (double) f.length() / (1024 * 1024));
			} else if (f.isDirectory()) {
//				for(String fic: f.list()) {
//					System.out.println(fic);
				
				List<File> ficherosEnDirectorio = Arrays.asList(f.listFiles());
				ficherosEnDirectorio.stream().filter(File::isFile).forEach(t -> System.out.println(t.getName())); 
			}

		}

		return true;
	}

	

	public static void main(String[] args) {
		// File file1 = new
		// File("C:\\Users\\Luciano\\Documents\\PruebaArchivo\\EjercicioFichero.txt");
		// FileUtils.analiza(file1);

		File file2 = new File("C:\\Users\\Luciano\\Documents\\PruebaArchivo");
		FileUtils.analiza(file2);
	}

}
