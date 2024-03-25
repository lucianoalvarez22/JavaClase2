package pruebaTecnicaReservaAsientos;

import java.util.Scanner;

public class ReservaAsientos {

	static void pintaMapaAsientos(char asientos[][]) {

		System.out.print("  ");
		for (int i = 0; i < 10; i++) {
			char columnLabel = (char) ('A' + i);
			System.out.print(" " + columnLabel + "  ");
		}

		System.out.println();

		for (int f = 0; f < 10; f++) {
			System.out.print(f + " ");
			for (int c = 0; c < 10; c++) {
				System.out.print("[" + asientos[f][c] + "]" + " ");

			}
			System.out.println("");
		}

	}

	public static void main(String[] args) {

		char asientos[][] = new char[10][10];

		// Bandera va a ser como un guardia para usarlo en un while
		boolean bandera = false;

		// Para que el usuario meta un numero por eso pongo "in"
		Scanner teclado = new Scanner(System.in);
		int fila;
		int asiento;
		String asientoElegido;
		String respuesta;

		for (int f = 0; f < 10; f++) {
			for (int c = 0; c < 10; c++) {
				asientos[f][c] = 'L';
			}
		}

		System.out.println("------- BIENVENIDO AL SISTEMA DE RESERVAS -------");

		while (bandera != true) {

			System.out.println("\n Mapa de asientos disponibles: ");
			pintaMapaAsientos(asientos);

			System.out.println("\n Ingrese Fila (Entre 0 y 9) y Asiento (Entre A y J) a Reservar");
			asientoElegido = teclado.next().toUpperCase();

			if (asientoElegido.length() != 2) {
				System.out.println("Formato de asiento incorrecto. Por favor, intente de nuevo.");
				continue;
			}

			fila = Character.getNumericValue(asientoElegido.charAt(0));
			asiento = (int) (asientoElegido.charAt(1) - 'A');

			if (fila < 0 || fila > 9 || asiento < 0 || asiento > 9) {
				System.out.println("Fila o asiento no válidos. Por favor, intente de nuevo.");
				continue;
			}

			if (asientos[fila][asiento] == 'L') {
				asientos[fila][asiento] = 'X';
				System.out.println("El asiento fue reservado correctamente");
			} else {
				System.out.println("El asiento está ocupado. Por favor elija otro.");
			}

			System.out.println("¿Desea finalizar la reserva? S: si / Cualquier otra letra: NO");
			respuesta = teclado.next();
			if (respuesta.equalsIgnoreCase("S")) {
				System.out.println("Gracias por su visita");
				bandera = true;
			}
		}

	}

}
