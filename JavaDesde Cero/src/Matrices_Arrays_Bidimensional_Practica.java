
public class Matrices_Arrays_Bidimensional_Practica {

	public static void main(String[] args) {
		
		//PRACTICA - TABLA DE INTERESES - 10% 11% 12% ETC
		
		double acumulado;
		double interes = 0.10; //INTERESES DEL 10% = 0.10
		
		double[][] saldo = new double [6][5]; //CREAMOS UNA ARRAY DE 2 DIMENSIONES DE 6X5
		
		//RELLENAR EL ARRAY DE FORMA AUTOMATICA HACIENDOLE EL CALCULO CON DOS BUCLES
		
		for(int i=0; i<6; i++) {
			saldo[i][0]=10000; //LO QUE HACEMOS AQUI ES DECIR QUE EN LA POSICION 0,0 SIEMPRE SERÁ 10000
			acumulado=10000; //INICIALIZAMOS LA VARIABLE ACUMULADO TAMBIÉN A 10000 E IRA INCREMENTANDO
			
			for(int j=1; j<5; j++) {
				
				acumulado = acumulado+(acumulado*interes); //HACEMOS LAS CUENTAS
				saldo[i][j] = acumulado; //Y EL SADO I,J SE IRÁ ACUMULANDO SEGUN LAS CUENTAS
			}
			
			interes = interes+0.01; //AQUI ESTAMOS DICIENDO QUE UNA VEZ QUE TERMINE CON EL SEGUNDO BUCLE, QUE AUMENTE EL 			INTERES. PARA QUE NO SEA SIEMPRE 10% Y SEA 11 POR EJEMPLO. Y VUELVE OTRA VEZ AL PRIMER BUCLE
		}
		
		
		//LEER LA MATRIZ CON DOS BUCLES FOR
		
		for(int z=0; z<6; z++) {
			
			System.out.println();
			
			for(int h=0; h<5; h++) {
				System.out.printf("%1.2f", saldo[z][h]);
				
				System.out.print(" ");
			}
		}

	}

}
