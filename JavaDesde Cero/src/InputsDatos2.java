import javax.swing.*;
public class InputsDatos2 {

	public static void main(String[] args) {
		
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre: "); //Metodo devuelve STRING
		
		String edad=JOptionPane.showInputDialog("Introduce la edad: "); //Devuelve STRING
		
		int edad_parseada = Integer.parseInt(edad); //Parseamos el string a ENTERO 
		
		edad_parseada++; //INCREMENTAMOS EN 1 LA EDAD
		
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + edad_parseada + " años" );

	}

}
