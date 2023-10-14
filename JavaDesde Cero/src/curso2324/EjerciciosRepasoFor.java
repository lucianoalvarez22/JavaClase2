package curso2324;

import java.util.Iterator;
import java.util.Random;

public class EjerciciosRepasoFor {

	public static void main(String[] args) {
		// l) El abecedario inglés alternando mayúsculas y minúsculas es:
		// AbCdEfGhIjKlMnOpQrStUvWxYz
//		int contador = 0;
//		for(char c = 'A'; c<='Z'; c++) {
//			contador++;
//			if(c%2!=0) {
//				System.out.print(c);
//			} else {
//		    	 System.out.print((char)(c+32));
//		    }
//		}

//		 El abecedario inglés de letras minúsculas de 3 en 3 letras es: adgjmpsvy

		for (char letra = 'a'; letra <= 'z'; letra += 3) {
			System.out.print(letra);
		}
		
		for (char letra = 'z'; letra >= 'a'; letra--) {
//			System.out.print(letra);
		}
		
		for (char letra = 'A'; letra <= 'Z'; letra++) {
			//System.out.print(letra);
		}
		
		int ini = (int)'A';
		int fin = (int)'Z';
		boolean esMayuscula = true;

		System.out.print("l) El abecedario inglés alternando mayúsculas y minúsculas es:\n   ");         
		for(int i = ini; i <= fin; i++){
		    if(esMayuscula)  
		        System.out.print((char)i);
		    else 
		        System.out.print((char)(i+32));
		    esMayuscula = !esMayuscula;
		}
		System.out.println();
		

		// HACER UNA ARRAY DE 10_000 NUMEROS ALEATORIOS Y BUSCAR EL MINIMO Y EL MAXIMO

//		int[] num = new int[10000];
//		Random random = new Random();
//
//		for (int i = 0; i < num.length; i++) {
//			num[i] = random.nextInt(10000);
		// System.out.println(i); prueba
//		}

		// mínimo y máximo
//		int min = num[0];
//		int max = num[0];
//
//		for (int y : num) {
//		    if (y < min) {
//		        min = y;
//		    }
//		    if (y> max) {
//		        max = y;
//		    }
//		}	

//		for (int y = 0; y < num.length; y++) {
//			if (num[y] < min) {
//				min = num[y];
//			}
//			if (num[y] > max) {
//				max = num[y];
//			}
//		}

		// usando foreach
//		for (int i : num) {
//			System.out.println(num[i]); 
//		}
//         System.out.println("Minimo: " + min);
//         System.out.println("Maximo: " + max);

	}
}
