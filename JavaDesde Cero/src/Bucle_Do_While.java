import javax.swing.*;
public class Bucle_Do_While {

	public static void main(String[] args) {
		
		//PROGRAMA PARA AVERIGUAR EL PESO IDEAL SI ES HOMBRE O MUJER con bucle DO WHILE
		// HOMBRE = ALTURA EN CM - 110
		// MUJER = ALTURA EN CM - 120
		
		String genero = "";
		
		do {
			
			genero = JOptionPane.showInputDialog("Introduce tu género (H/M)");
			
		}while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") ==false);
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm")); //PARSEAMOS A ALTURA A ENTERO. El metodo JOPtion devuelve un string
		int pesoIdeal = 0;
		
		if(genero.equalsIgnoreCase("H")) { //SI GENERO ES HOMBRE
			
			pesoIdeal = altura - 100;
		}
		
		else if (genero.equalsIgnoreCase("M")) { // SI GENERO ES MUJER
			
			pesoIdeal = altura - 120;
		}
		
		System.out.println("Tu peso ideal es " + pesoIdeal + " kg");

	}

}
