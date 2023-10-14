import javax.swing.JOptionPane;
public class Bucle_For_Factorial {

	public static void main(String[] args) {
		
		long resultado = 1L; //Si declaramos la variable con INT o Long, al poner el factorial de un numero grande se va de rango
		
		//Existe una clase llamada BigInteger que se podría usar para que no se vaya de rango
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
		
		for (int i=numero; i>0; i--) {
			resultado = resultado*i;
		}
		
		System.out.println("El factorial de " + numero + " es " + resultado);
		
		
		

	}

}
