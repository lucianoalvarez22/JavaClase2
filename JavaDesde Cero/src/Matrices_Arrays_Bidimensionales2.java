
public class Matrices_Arrays_Bidimensionales2 {

	public static void main(String[] args) {
		
		//DECLARAR Y RELLENAR UNA MATRIZ BIDIMENSIONAL DE UNA FORMA MAS SIMPLE
		//TAMBIÉN USAREMOS EL FOR EACH
		
		int [][] matrix= {  //FORMA MAS SIMPLE - MATRIZ DE 2 DIMENSIONES CON 20 ELEMENTOS
				{10,15,18,19,21},
				{5,25,37,41,15},
				{7,19,32,14,90},
				{85,2,7,40,27}
		};
		
		// RECORRIENDO CON FOR EACH
		
		for(int[] fila:matrix) { 
			
			System.out.println();
			
			for(int z:fila) {
				
				System.out.print(z + " ");
			}
		}

	}

}
