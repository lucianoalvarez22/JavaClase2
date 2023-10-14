
public class Matrices_Arrays {

	public static void main(String[] args) {
		
		//Estructura de datos que contiene una coleccion de valores del MISMO TIPO
		//Sirva para almacenar valores que tengan una relacion entre si
		
		//PRIMERA FORMA DE DECLARAR E INICIAR MATRIZ
//		int [] mi_matriz = new int [5];
//		
//		mi_matriz[0] = 5;
//		mi_matriz[1] = 38;
//		mi_matriz[2] = 15;
//		mi_matriz[3] = 56;
//		mi_matriz[4] = 89;
		
		//OTRA FORMA DE DECLARACION E INICIACION DE MATRIZ
		int [] mi_matriz = {5, 38, 15, 56, 89};
		
		for(int i=0; i<mi_matriz.length; i++) {
			System.out.println("Valor del indice "  +  i + " = " + mi_matriz[i]);
		}
		
		

	}

}
