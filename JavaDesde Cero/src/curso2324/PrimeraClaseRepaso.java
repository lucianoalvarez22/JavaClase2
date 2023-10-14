package curso2324;

public class PrimeraClaseRepaso {

	public static void main(String[] args) {
		// EJERCICIO DE OPERADOR TERNARIO
//		int edad = 80;
//		String nombre = "luciano";
//		boolean varon = true;
//		String frasefinal = edad < 18 ? " es menor de edad"
//				: edad < 65 ? " es mayor de edad" : varon ? "jubilado" : "jubilada";
//
//		System.out.printf("La edad de %s es %d y es %s%n", nombre, edad, frasefinal);

		// EJERCICIO CON SWITCH EJERCICIO 1
//		int numero = 1;
//		String mes;
//
//		switch (numero) {
//
//		case 1:
//			mes = "Enero";
//			break;
//		case 2:
//			mes = "Febrero";
//			break;
//
//		case 3:
//			mes = "Marzo";
//			break;
//
//		case 4:
//			mes = "Abril";
//			break;
//
//		case 5:
//			mes = "Mayo";
//			break;
//		case 6:
//			mes = "Junio";
//			break;
//
//		case 7:
//			mes = "Julio";
//			break;
//		case 8:
//			mes = "Agosto";
//			break;
//		case 9:
//			mes = "Septiembre";
//			break;
//		case 10:
//			mes = "Octubre";
//			break;
//
//		case 11:
//			mes = "Noviembre";
//			break;
//
//		case 12:
//			mes = "Diciembre";
//			break;
//
//		default:
//			mes = "No existe";
//		}
//
//		System.out.printf("El mes %d es %s%n", numero, mes);
//
//		// AHORA CON IF EJERCICIO 1
//		if (numero == 1) {
//			System.out.printf("El mes %d es %s%n", numero, mes);
//		} else if (numero == 2) {
//			System.out.printf("El mes %d es %s%n", numero, mes);
//		} else if (numero == 3) {
//			System.out.printf("El mes %d es %s%n", numero, mes);
//		} else if (numero == 4) {
//			System.out.printf("El mes %d es %s%n", numero, mes);
//		} else if (numero == 5) {
//			System.out.printf("El mes %d es %s%n", numero, mes);
//		} else if (numero == 6) {
//			System.out.printf("El mes %d es %s%n", numero, mes);
//		} else if (numero == 7) {
//			System.out.printf("El mes %d es %s%n", numero, mes);
//		} else if (numero == 8) {
//			System.out.printf("El mes %d es %s%n", numero, mes);
//		} else if (numero == 9) {
//			System.out.printf("El mes %d es %s%n", numero, mes);
//		} else if (numero == 10) {
//			System.out.printf("El mes %d es %s%n", numero, mes);
//		} else if (numero == 11) {
//			System.out.printf("El mes %d es %s%n", numero, mes);
//		} else if (numero == 12) {
//			System.out.printf("El mes %d es %s%n", numero, mes);
//		} else {
//			System.out.println("No existe mes");
//		}
//
//		// EJERCICIO 2 CON SWITCH
//
//		int numero2 = 7;
//		String meses = "Enero";
//
//		switch (meses) {
//
//		case "Enero":
//			numero2 = 1;
//			break;
//		case "Febrero":
//			numero2 = 2;
//			break;
//
//		case "Marzo":
//			numero2 = 3;
//			break;
//
//		case "Abril":
//			numero2 = 4;
//			break;
//
//		case "Mayo":
//			numero2 = 5;
//			break;
//		case "Junio":
//			numero2 = 6;
//			break;
//
//		case "Julio":
//			numero2 = 7;
//			break;
//		case "Agosto":
//			numero2 = 8;
//			break;
//		case "Septiembre":
//			numero2 = 9;
//			break;
//		case "Octubre":
//			numero2 = 10;
//			break;
//
//		case "Noviembre":
//			numero2 = 11;
//			break;
//
//		case "Diciembre":
//			numero2 = 12;
//			break;
//
//		default:
//			mes = "No existe";
//		}
//
//		System.out.printf("El mes %s es %d%n", meses, numero2);

		// Un array de 1000 numeros pares consecutivos a partir de 800 pero ordenados inversamente.
		// Luego suma los valores del array
		
//		int[] array_mil = new int[1000];
//		int contador=800;
//		for (int i = 999; i >-1; i--) {
//				array_mil[i]=contador;
//				contador= contador+2;
//
//		}
//		
//		int suma2 =0;
//		
//		for (int elem : array_mil) {
//			suma2+=elem;
//		}
//		System.out.println("Suma total: " + suma2);
		
		
		// SOLUCION DEL PROFESOR
		
//		int numElem = 50_000;
//		int inicio = 800;
//		int multiploDe = 2;
//		int[] array = new int[numElem];
//						
//		for(int i = 0; i < array.length; i++) {
//			array[i] = inicio + (array.length - i - 1) * 2;
//		}
//
//		long suma = 0;
//		for(int elem: array) {
//			suma += elem;
//		}	
//		System.out.println("Suma: " + suma);

	}

}
