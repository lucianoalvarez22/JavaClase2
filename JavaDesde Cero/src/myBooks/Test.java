package myBooks;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {

		// nstanciar los siguientes 10 libros
		Libro lib0 = new Libro("Cien años de soledad", "Gabriel García Márquez", 735, 3, false, 20.99);
		Libro lib1 = new Libro("El señor de los anillos", "J. R. R. Tolkien", 429, 5, false, 22.99);
		Libro lib2 = new Libro("1984", "George Orwel", 122, 9, false, 40.99);
		Libro lib3 = new Libro("Un mundo feliz", "Aldous Huxley", 270, 1, false, 25.99);
		Libro lib4 = new Libro("Orgullo y prejuicio", "Jane Austen", 340, 2, true, 12.99);
		Libro lib5 = new Libro("Crimen y castigo", "Fiódor Dostoyevski", 259, 3, false, 60.99);
		Libro lib6 = new Libro("Lolita", "Vladimir Nabokov", 300, 5, false, 27.99);
		Libro lib7 = new Libro("Ulises", "James Joyce", 400, 4, false, 42.99);
		Libro lib8 = new Libro("Madame Bovary", "Gustave Flaubert", 723, 9, true, 9.99);
		Libro lib9 = new Libro("En busca del tiempo perdido", "Marcel Proust", 374, 2, true, 9.99);

		// Realiza algo parecido con 5 revistas que tu decidas
		Revista rev0 = new Revista("BeSoccer", 650, 10, false, 2.50);
		Revista rev1 = new Revista("Marca", 300, 7, false, 1);
		Revista rev2 = new Revista("Twitter", 150, 10, true, 1.5);
		Revista rev3 = new Revista("Hola", 60, 4, false, 7.80);
		Revista rev4 = new Revista("WWE", 100, 20, true, 2.99);

		// Mételos todos en un array llamado publicaciones
		Publicacion[] publicaciones = { lib0, lib1, lib2, lib3, lib4, lib5, lib6, lib7, lib8, lib9, rev0, rev1, rev2,
				rev3, rev4 };

		// Todas las publicaciones del array publicaciones con título y ID
		// Solo libros del array publicaciones con ID y título (usar instanceof para
		// discriminar).
		// Solo revistas del array publicaciones con ID y título (usar instanceof para
		// discriminar).

		Libro[] libroArray = new Libro[publicaciones.length];
		Revista[] revistaArray = new Revista[publicaciones.length];

		System.out.println("\nTodas las Publicaciones-Array\n======================\n");
		for (int i = 0; i < publicaciones.length; i++) {
			System.out.println("Titulo: " + publicaciones[i].getTitulo() + " ID: " + publicaciones[i].getID());
			if (publicaciones[i] instanceof Libro)
				libroArray[i] = (Libro) publicaciones[i];
			else
				revistaArray[i] = (Revista) publicaciones[i];
		}

		System.out.println("\nLibros-Array\n===========\n");

		for (Libro libroElem : libroArray) {
			if (libroElem != null)
				System.out.println("Titulo: " + libroElem.getTitulo() + "ID: " + libroElem.getID());
		}
		System.out.println("\nRevistas-Array\n===========\n");

		for (Revista revistaElem : revistaArray) {
			if (revistaElem != null)
				System.out.println("Titulo: " + revistaElem.getTitulo() + " ID: " + revistaElem.getID());
		}

		// Todas las publicaciones del array publicaciones con ID, título y precio pero
		// filtrando aquellas que tienen un precio mayor de 20 euros.

		// Solo libros del array publicaciones con ID y título y precio pero filtrando
		// aquellas que tienen un precio mayor de 20 euros. (usar instanceof para
		// discriminar).
		// Solo revistas del array publicaciones con ID y título y precio pero filtrando
		// aquellas que tienen un precio mayor de 3 euros (usar instanceof para
		// discriminar).
		Libro[] libroArrayPrecio = new Libro[publicaciones.length];
		Revista[] revistaArrayPrecio = new Revista[publicaciones.length];

		System.out.println(
				"\nTodas las publicaciones-Array con precio mayor a 20€\n===============================================\n");
		for (int i = 0; i < publicaciones.length; i++) {
			if (publicaciones[i].getPrecio() > 20) {
				System.out.println("Titulo: " + publicaciones[i].getTitulo() + " ID: " + publicaciones[i].getID()
						+ " Precio: " + publicaciones[i].getPrecio());
			}
			if (publicaciones[i] instanceof Libro && publicaciones[i].getPrecio() > 20) {
				libroArrayPrecio[i] = (Libro) publicaciones[i];
			} else if (publicaciones[i] instanceof Revista && publicaciones[i].getPrecio() > 3) {
				revistaArrayPrecio[i] = (Revista) publicaciones[i];
			}
		}

		System.out.println("\nLibros-Array con precio mayor a 20€\n============================\n");
		for (Libro libroElem : libroArrayPrecio) {
			if (libroElem != null)
				System.out.println("Titulo: " + libroElem.getTitulo() + " ID: " + libroElem.getID() + " Precio: "
						+ libroElem.getPrecio());
		}

		System.out.println("\nRevista-Array con precio mayor a 20€\n=============================\n");
		for (Revista revistaElem : revistaArrayPrecio) {
			if (revistaElem != null)
				System.out.println("Titulo: " + revistaElem.getTitulo() + " ID: " + revistaElem.getID() + " Precio: "
						+ revistaElem.getPrecio());
		}

		System.out.println();
		System.out.println("----------------- LO MISMO CON ARRAYLIST -----------------------------------------------");
		// Realizar todo el proceso anterior utilizando ArrayList
		ArrayList<Publicacion> listaPublicaciones = new ArrayList<>();
		ArrayList<Publicacion> libroArrayList = new ArrayList<>();
		ArrayList<Publicacion> revistaArrayList = new ArrayList<>();
		listaPublicaciones.add(lib0);
		listaPublicaciones.add(lib1);
		listaPublicaciones.add(lib2);
		listaPublicaciones.add(lib3);
		listaPublicaciones.add(lib4);
		listaPublicaciones.add(lib5);
		listaPublicaciones.add(lib6);
		listaPublicaciones.add(lib7);
		listaPublicaciones.add(lib8);
		listaPublicaciones.add(lib9);
		listaPublicaciones.add(rev0);
		listaPublicaciones.add(rev1);
		listaPublicaciones.add(rev2);
		listaPublicaciones.add(rev3);
		listaPublicaciones.add(rev4);

		// Todas las publicaciones del array publicaciones con título y ID
		// Solo libros del array publicaciones con ID y título (usar instanceof para
		// discriminar).
		// Solo revistas del array publicaciones con ID y título (usar instanceof para
		// discriminar).

		System.out.println("\nTodas las Publicaciones ArrayList\n=================================\n");
		for (Publicacion publiActual : listaPublicaciones) {
			System.out.println("Titulo: " + publiActual.getTitulo() + " ID: " + publiActual.getID());
			if (publiActual instanceof Libro) {
				libroArrayList.add(publiActual);
			} else if (publiActual instanceof Revista) {
				revistaArrayList.add(publiActual);
			}

		}
		System.out.println("\nRevista ArrayList\n=====================\n");
		for (Publicacion revistaElem : revistaArrayList) {
			System.out.println("Titulo: " + revistaElem.getTitulo() + " ID: " + revistaElem.getID());
		}

		System.out.println("\nLibros ArrayList\n==================\n");
		for (Publicacion libroElem : libroArrayList) {
			System.out.println("Titulo: " + libroElem.getTitulo() + " ID: " + libroElem.getID());
		}

		// Todas las publicaciones del array publicaciones con ID, título y precio pero
		// filtrando aquellas que tienen un precio mayor de 20 euros.

		// Solo libros del array publicaciones con ID y título y precio pero filtrando
		// aquellas que tienen un precio mayor de 20 euros. (usar instanceof para
		// discriminar).
		// Solo revistas del array publicaciones con ID y título y precio pero filtrando
		// aquellas que tienen un precio mayor de 3 euros (usar instanceof para
		// discriminar).
		ArrayList<Publicacion> libroArrayListPrecio = new ArrayList<>();
		ArrayList<Publicacion> revistaArrayListPrecio = new ArrayList<>();

		System.out.println(
				"\nTodas las Publicaciones-ArrayList mayor de 20€\n==================================================\n");
		for (Publicacion publiActual : listaPublicaciones) {
			if (publiActual.getPrecio() > 20) {
				System.out.println("Titulo: " + publiActual.getTitulo() + " ID: " + publiActual.getID() + " Precio: "
						+ publiActual.getPrecio());
			}
			if (publiActual instanceof Libro && publiActual.getPrecio() > 20) {
				libroArrayListPrecio.add(publiActual);
			} else if (publiActual instanceof Revista && publiActual.getPrecio() > 3) {
				revistaArrayListPrecio.add(publiActual);
			}
		}

		System.out.println("\nLibros-ArrayList con precio mayor a 20€\n===================================\n");
		for (Publicacion libroElem : libroArrayListPrecio) {
			System.out.println("Titulo: " + libroElem.getTitulo() + " ID: " + libroElem.getID() + " Precio: "
					+ libroElem.getPrecio());
		}

		System.out.println("\nRevistas-ArrayList con precio mayor a 3€\n============================\n");
		for (Publicacion revistaElem : revistaArrayListPrecio) {
			System.out.println("Titulo: " + revistaElem.getTitulo() + " ID: " + revistaElem.getID() + " Precio: "
					+ revistaElem.getPrecio());
		}

		System.out.println();
		System.out.println("-----------------Verificación de lectura y métodos---------------------------------");

		// Verificación de lectura y métodos de presentación correctos
		// Utiliza el libro Ulises, pero dentro del array. No utilices lib7
		for (Publicacion libroActual : libroArrayList) {
			if (libroActual instanceof Libro && libroActual.getTitulo().equalsIgnoreCase("Ulises")) {
				// Muestra su estado con show
				System.out.println(libroActual.show());
				// ((Libro) libroActual).showStatic( (Libro) libroActual);

			}
		}

		System.out.println(
				"\nLee 300 paginas de forma silenciosa y verifica PAGINA 304\n=====================================================\n");
		// Lee 300 paginas de forma silenciosa con el método estático y verifica que
		// estás en la página 304
		for (Publicacion publiActual : listaPublicaciones) {
			if (publiActual instanceof Libro && publiActual.getTitulo().equalsIgnoreCase("Ulises")) {
				for (int i = 0; i < 301; i++) {
					publiActual.leePaginaStatic(true, publiActual);
				}
			}
		}

		System.out.println(
				"\nLee 5 paginas de forma NO silenciosa y verifica PAGINA 309\n=========================================================\n");
		// 4. Lee 5 palabras de forma NO silenciosa con el método estático y verifica
		// que estás en la página 309.
		for (Publicacion publiActual : listaPublicaciones) {
			if (publiActual instanceof Libro && publiActual.getTitulo().equalsIgnoreCase("Ulises")) {
				for (int i = 0; i < 5; i++) {
					publiActual.leePaginaStatic(false, publiActual);
				}
			}
		}

		System.out.println(
				"\nLee 10 paginas de forma NO silenciosa y verifica PAGINA 310\n===================================================\n");
		// 5. Lee 10 palabras de forma NO silenciosa con el método NO estático y
		// verifica que estás en la página 310.
		for (Publicacion publiActual : listaPublicaciones) {
			if (publiActual instanceof Libro && publiActual.getTitulo().equalsIgnoreCase("Ulises")) {
				for (int i = 0; i < 9; i++) {
					publiActual.leePagina(false);
					if (publiActual.getPagActual() == 311) {
						break;
					}
				}
			}
		}
		// Lee 1000 palabras con el método NO estático y verifica que figura como leído
		// y está en la página 400.

		System.out.println(
				"\nLee 1000 paginas con el método NO estático. Verifica como leido y que está en la página 400\n================"
				+ "==============================================================================================\n");

		for (Publicacion publiActual : listaPublicaciones) {
			if (publiActual instanceof Libro && publiActual.getTitulo().equalsIgnoreCase("Ulises")) {
				for (int i = 0; i <= 1000; i++) {
					publiActual.leePagina(false);
					;
				}
			}
		}

	}
}
