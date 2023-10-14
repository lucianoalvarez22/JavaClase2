import javax.swing.*;
public class BucleWhile {

	public static void main(String[] args) {
		
		//BUCLE WHILE - MIENTRAS LA CONDICIONA SEA CIERTA, SE EJECUTA LAS LINEAS DE DENTRO DEL BUCLE
		
		//Simulacion de acceso a una contraseña 
		
		String clave = "Luciano"; //La clave qe el usuario tiene que utilizar
		
		String pass = ""; //String vacio
		
		while (clave.equals(pass)==false) { //La condicion se cumple porque es false porque Clave y Pass no son iguales
			pass = JOptionPane.showInputDialog("Introduce la contraseña: ");
			
			if (clave.equals(pass) == false) {
				
				System.out.println("Contraseña incorrecta");
				
				}
			}
		
		System.out.println("Contraseña correcta");

	}

}
