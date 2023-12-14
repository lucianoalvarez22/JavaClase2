package _collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class Parking {

	private String nombre;
	private int totalPlazas;
	private List<Coche> listaCoches;
	private Map<Color, Integer> mapCoche;

	public Parking(String nombre, int totalPlazas) {
		this.nombre = nombre;
		this.totalPlazas = totalPlazas;
		this.listaCoches = new ArrayList<>();
		this.mapCoche = new HashMap<>();
	}

	public boolean entraCoche(Coche c) {
		boolean comprobacionPlazas = (listaCoches.size() < this.totalPlazas || listaCoches.isEmpty());

		if (!listaCoches.contains(c) && comprobacionPlazas) {
			listaCoches.add(c);
			if (mapCoche.containsKey(c.getColor())) {
				int value = mapCoche.get(c.getColor());
				value = value + 1;
				mapCoche.put(c.getColor(), value);
			} else {
				mapCoche.put(c.getColor(), 1);
			}

		}

		return comprobacionPlazas;

	}

	private boolean compruebaCoche(Coche c) {
		return listaCoches.contains(c) || listaCoches.isEmpty();
	}

	public boolean saleCoche(Coche c) {
		boolean hayCoche = compruebaCoche(c);

		if (hayCoche) {
			listaCoches.remove(c);

		}

		return hayCoche;
	}

	public boolean saleCocheAleatrorio() {
		Random r = new Random();
		return saleCoche(listaCoches.get(r.nextInt(listaCoches.size())));
	}

	public boolean vaciaParking() {
		if (listaCoches.isEmpty()) {
			return false;
		} else {
			for (int i = listaCoches.size() - 1; i >= 0; i--) {
				listaCoches.remove(i);
			}
			return true;
		}
	}

	public void reportParking() {

		if (listaCoches.isEmpty()) {
			System.out.println("Parking Vacio");
		} else {
			int totalCoches = 0;
			System.out.println("\nListado Coches: \n======================\n" + "\nParking: " + nombre + "\n");
			for (Coche c : listaCoches) {
				System.out.println("Coche: color= " + c.getColor().getNombreCompleto() + ", marca= "
						+ c.getMarca().getNomCompleto());
				totalCoches++;
			}

			System.out.println(
					"Total coches: " + listaCoches.size() + ", plazas libres: " + (totalPlazas - listaCoches.size()));

		}
	}

	public Map<Color, Integer> getMapCochesColor() {
		return mapCoche;
	}

	public void reportColores() {
		Map<Color, Integer> colores = getMapCochesColor();

		System.out.println("\nREPORT DE COLORES:\n================\n");
		System.out.println("Parking: " + nombre + "\n");
		for (Entry<Color, Integer> entry : colores.entrySet()) {
			Color color = entry.getKey();
			int cantidad = entry.getValue();

			String plural = cantidad > 1 ? "veces" : "vez";

			System.out.println(
					"El coche de color " + color.getNombreCompleto() + " se repite " + cantidad + " " + plural);
		}
	}
}
