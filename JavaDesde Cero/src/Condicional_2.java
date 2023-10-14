import java.util.*;
import javax.swing.*;
public class Condicional_2 {

	public static void main(String[] args) {
		
		//AVERIGUAR EL AREA DE 4 FIGURAS GEOMETRICAS (CUADRADO, RECTANGULO, TRIANGULO, CIRCULO)
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo"); // La \n da un salto de linea
		int eleccion_figura = entrada.nextInt(); //Almacenamos en la variable eleccion lo que introdujo el usuario
		
		switch (eleccion_figura) {
		
		case 1: 
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado: ")); //PARSEAMOS A ENTERO LO QUE EL USUARIO PONGA EN EL PANEL JOPTION QUE DEVUELVE STRING
			System.out.println("El area del cuadrado es: " + Math.pow(lado, 2)); //METODO POW Para elevar un numero a su exponente
			break; //Dentro del CASE siempre que tiene haber un BREAK
		
		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: "));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: "));
			System.out.println("El area del rectangulo es: " + base*altura);
			break;
			
		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: "));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: "));
			System.out.println("El area del triangulo es: " + (base*altura)/2);
			break;
			
		case 4:
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio: "));
			System.out.print("El area del circulo es: ");
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			break;
		
		default: //Es como si fuera un ELSE
			System.out.println("La opcion no es correcta");
			
		}
	}

}
