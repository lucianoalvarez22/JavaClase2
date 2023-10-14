package collectionsymaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test {

	public static String[] devuelvePalabras(String cuentos) {
		return cuentos.trim().replace(".", " ").replaceAll(",", " ").replace("\n", " ").replaceAll(" +", " ")
				.toLowerCase().split(" ");

	}

	public static void arrayPalabras(String[] cuentos) {
		System.out.println("Array de palabras");
		System.out.println("=================");

		for (String palabra : cuentos) {
			System.out.printf("[%s]", palabra);
		}

		System.out.printf("%nLista original tiene %d palabras.%n", cuentos.length);
	}

	private static void arrayListPalabras(String[] cuento) {
		System.out.println("ArrayList de palabras");
		System.out.println("=================");

		// Creamos una lista de ArrayList
		List<String> arrayList = new ArrayList<>();
		// METEMOS LAS PALABRAS EN ARRAYLIST
		for (String palabra : cuento) {
			arrayList.add(palabra);
		}

		for (String palabra : arrayList) {
			System.out.printf("[%s]", palabra);
		}

		System.out.printf("%nLista en ArrayList tiene %d palabras.%n", arrayList.size());

	}

	public static void hashSetPalabra(String[] cuento) {
		// LISTA UNICA DE PALABRAS DESORDENADAS
		System.out.println("HashSet de palabras");
		System.out.println("=================");
		Set<String> hashSet = new HashSet<>();

		for (String palabra : cuento) {
			hashSet.add(palabra);
		}

		for (String palabra : hashSet) {
			System.out.printf("[%s]", palabra);
		}

		System.out.printf("%nLista en HashSet tiene %d palabras.%n", hashSet.size());

	}

	public static void treeSetPalabra(String[] cuento) {
		// LISTA UNICA DE PALABRAS ORDENADAS POR ORDEN ALFABETICO POR DEFECTO
		System.out.println("TreeSet de palabras");
		System.out.println("=================");
		Set<String> treeSet = new TreeSet<>();

		for (String palabra : cuento) {
			treeSet.add(palabra);
		}

		for (String palabra : treeSet) {
			System.out.printf("[%s]", palabra);
		}

		System.out.printf("%nLista en treeSet tiene %d palabras.%n", treeSet.size());

	}

	private static void mapConteoPalabras(String[] cuento) {
		System.out.println("Conteo de repeticiones de palabras");
		System.out.println("=================");

		// CREAMOS UN MAP
		Map<String, Integer> map = new HashMap<>();

		// RECORREMOS EL CUENTO, Y A LA LLAVE PALABRA LE PONE UN 0
		for (String palabra : cuento) {
			map.put(palabra, map.containsKey(palabra)? map.get(palabra)+1:1);	
		}

		for (String palabra : map.keySet()) {
			System.out.printf("[%s(%d)]%n", palabra, map.get(palabra));
		}

		System.out.println();
	}
	
	
	private static void mapConteoPalabrasOrdenado(String[] cuento) {
		System.out.println("Conteo de repeticiones de palabras ORDENADAS");
		System.out.println("=================");

		// CREAMOS UN MAP
		Map<String, Integer> map = new TreeMap<>();

		// RECORREMOS EL CUENTO, Y A LA LLAVE PALABRA LE PONE UN 0
		for (String palabra : cuento) {
			map.put(palabra, map.containsKey(palabra)? map.get(palabra)+1:1);	
		}

		for (String palabra : map.keySet()) {
			System.out.printf("[%s(%d)]%n", palabra, map.get(palabra));
		}

		System.out.println();
	}

	public static void main(String[] args) {

		String[] miCuento = devuelvePalabras(CuentaCuentos.cuentoLechera());

		devuelvePalabras(CuentaCuentos.cuentoLechera());
		arrayPalabras(miCuento);
		System.out.println();
		arrayListPalabras(miCuento);
		System.out.println();
		hashSetPalabra(miCuento);
		System.out.println();
		treeSetPalabra(miCuento);
		System.out.println();
		mapConteoPalabras(miCuento);
		System.out.println();
		mapConteoPalabrasOrdenado(miCuento);

	}

}
