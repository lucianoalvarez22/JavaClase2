import javax.swing.*;
public class Inputs_Numeros {

	public static void main(String[] args) {
		
		double x = 10000.0;
		//System.out.printf("%1.2f",x/3); //IMPRIME CON FORMA - LE DA 2 DECIMALES AL RESULTADO DE LA DIVISION
		
		String num1 = JOptionPane.showInputDialog("Introduce un numero: ");
		double num_parseado = Double.parseDouble(num1); //PARSEAMOS A DOUBLE para que el metodo SQRT lo pille
		System.out.print("La raiz de: " + num_parseado + " es "); //SYSTEM PRINT PARA QUE LO IMPRIMAS SIN SALTO DE LINEA
		System.out.printf("%1.2f", Math.sqrt(num_parseado)); //PrintF para que pille el formato de 2 decimales
	}

}
