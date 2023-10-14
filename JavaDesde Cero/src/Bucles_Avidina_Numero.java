import java.util.*;
public class Bucles_Avidina_Numero {

	public static void main(String[] args) {
		
		//PROGRAMA QUE NOS DÉ UN NUMERO ALEATORIO Y TENEMOS QUE ADIVINAR CUAL ES
		//USAREMOS EL METODO RANDOM que devuelve un DOUBLE entre 0 y 1
		//Multiplicamos por 100 para que el MATH RANDOM me comprenda entre 0 y 100
		//Luego hacemos una REFUNDICION de double a ENTERO
		
		int aleatorio = (int)(Math.random()*100); //REFUNDICION A INT
		
		Scanner entrada = new Scanner (System.in);
		int numero = 0;
		int intentos = 0;
		
		while(numero!=aleatorio) {
			
			intentos++; //INCREMENTA EN 1 LA VARIABLE INTENTO QUE AL PRINCIPIO VALE 0
			System.out.println("Introduce un numero porfavor: ");
			numero = entrada.nextInt();
			
			if (aleatorio<numero) {
				System.out.println("Mas bajo");
			}
			
			else if (aleatorio>numero) {
				System.out.println("Mas alto");
			}
			
		}
		
		System.out.println("Numero adivinado. Lo has conseguido en " + intentos + " intentos");

	}

}
