package poo;

import java.util.LinkedList;
import java.util.ListIterator;

public class EjercicioLinkedList {

	public static void main(String[] args) {

		LinkedList<String> paises = new LinkedList<String>();

		paises.add("España");
		paises.add("Colombia");
		paises.add("Mexico");
		paises.add("Peru");

		LinkedList<String> capitales = new LinkedList<String>();

		capitales.add("Madrid");
		capitales.add("Bogota");
		capitales.add("DF");
		capitales.add("Lima");

//		System.out.println(paises);
//		System.out.println(capitales);

		// AGREGAREMOS LA LINKEDLIST CAPITALES A LA LINKEDLIST A PAISES CON UN ITEREITOR

		// ITEREITOR PARA LA PRIMERA LISTA
		ListIterator<String> iterPaises = paises.listIterator();

		// ITEREITOR PARA LA SEGUNDA LISTA
		ListIterator<String> iterCapitales = capitales.listIterator();

		// AGREGAMOS LOS ELEMENTOS DE LINKEDLIST EN LINKEDLIST
		while (iterCapitales.hasNext()) {
			if (iterPaises.hasNext()) {
				iterPaises.next();
			}

			iterPaises.add(iterCapitales.next());
		}

		System.out.println(paises);

		// VAMOS A BORRAR LOS ELEMENTOS PARES DE LA LINKEDLIST CAPITALES
		// HAY QUE VOLVER A PONER EL ITERADOR ARRIBA DE LA LISTA
		// VOLVEMOS A INICIALIZAR EL ITERADOR
		iterCapitales = capitales.listIterator();

		while (iterCapitales.hasNext()) {
			iterCapitales.next();
			if (iterCapitales.hasNext()) {
				iterCapitales.next();
				iterCapitales.remove();
			}
		}
		System.out.println(capitales);

		// AHORA VAMOS A ELIMINAR LAS CAPITALES DE LA LINKEDLIST PAISES. SOLO DEBERIA
		// ELIMINAR MADRID Y DF
		//USAREMOS REMOVEALL
		
		paises.removeAll(capitales);	
		System.out.println(paises);
		
		
	}

}
