import javax.swing.*;
public class Matrices_Arrays_BucleForEach {

	public static void main(String[] args) {
		
		//MATRIZ QUE ALMACENE PAISES
		String [] paises = new String [8];
		
		//CON ESTE FOR RELLENO LA MATRIZ CON LA CLASE JOptionPane
		for(int i =0; i<8; i++) {
			paises[i]=JOptionPane.showInputDialog("Introduce pais: " + (i+1));
		}
		
//		paises[0] = "España";
//		paises[1] = "Peru";
//		paises[2] = "Colombia";
//		paises[3] = "Italia";
//		paises[4] = "Mexico";
//		paises[5] = "Argentina";
//		paises[6] = "Francia";
//		paises[7] = "Marruecos";
		
//		for (int i=0; i<paises.length; i++) {
//			System.out.println("Pais " + (i+1) + " " +  paises[i]);
//		}
		
		
		//MATRIZ DE FORMA SIMPLIFICADA
		
//		String [] paises = {"España", "Peru", "Colombia", "Italia", "Mexico", "Argentina", "Francia" , 		"Marruecos"};
		
		
		
		
		
		// SINTAXIS FOR ECHA: Abrimos el FOR
		//DENTRO DEL FOR creamos una variable del MISMO TIPO que la MATRIZ (en este caso STRING)
		//Declaramos una variable, cualquiera, en este caso pongo elemento. Seguido de dos puntos y el nombre de la matriz
		
		for(String elemento:paises) {
			
			System.out.println("Pais " + elemento);
		}
	}

}
