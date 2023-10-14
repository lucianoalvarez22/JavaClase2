import java.util.*;
public class Condicional_1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		int edad = entrada.nextInt();
		
		//ENTRARÁ EN EL IF SIEMPRE QUE LA CONDICION SEA CIERTA
		if(edad<18) {
			System.out.println("Eres un adolescnete");
		}
		
		else if(edad<40) {
			System.out.println("Eres joven");
		}
		
		else if(edad<65) {
			System.out.println("Eres maduro");
		}
		
		else {
			System.out.println("Cuidate");
		}
		

	}

}
