
public class Matrices_Arrays_Bidimensionales {

	public static void main(String[] args) {
		
		//DECLARACION DE MATRIZ DE DOS DIMENSIONES 
		int [][] matrix= new int [4][5];
		
		matrix[0][0]=15;
		matrix[0][1]=21;
		matrix[0][2]=18;
		matrix[0][3]=9;
		matrix[0][4]=15;
		
		matrix[1][0]=10;
		matrix[1][1]=52;
		matrix[1][2]=17;
		matrix[1][3]=19;
		matrix[1][4]=7;
		
		matrix[2][0]=19;
		matrix[2][1]=2;
		matrix[2][2]=19;
		matrix[2][3]=17;
		matrix[2][4]=7;
		
		matrix[3][0]=92;
		matrix[3][1]=13;
		matrix[3][2]=13;
		matrix[3][3]=35;
		matrix[3][4]=48;
		
		for (int i=0; i<4; i++) { //ENTRA PRIMERO EN ESTE FOR - SE INICIALIZA I=0 Y VA AL OTRO FOR
			
			System.out.println(); //PRINT LN VACIO PARA QUE DÉ UN SALTO DE LINEA CADA VEZ QUE RECORRA TODA LA J
			
			for(int j=0; j<5; j++) { //AQUI RECORRE J HASTA QUE SEA 5 Y SALDRÁ DEL BUCLE E IRÁ PARA ARRIBA
				System.out.print(matrix[i][j] + " "); //PRINT PARA QUE LOS IMPRIME EN LINEA
			}
		}
	
		

	}

}
