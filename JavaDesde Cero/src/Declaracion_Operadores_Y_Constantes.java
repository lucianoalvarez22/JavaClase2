
public class Declaracion_Operadores_Y_Constantes {

	public static void main(String[] args) {
		
		//OPERADORES E INCREMENTO
		int a = 5;
		int b;
		
		b = 7;
		
		int c = b+a;
		c++; //Aqui estamos diciendo que incremente en 1 el valor de "c".
		//c+= 3;  Le estamos diciendo que incremente en +3 el valor de "c" que sera igual a 15
		//System.out.println(c);
		
		
		//CONTANTES
		 final int d =5; //Declaramos e inicializamos a 5 una constante
		
		//System.out.println(d);
		
		//Cuantas pulgadas hay en 6 centimetros
		final double apulgadas = 2.54;
		double cm = 6;
		double resultados= cm/apulgadas;
		System.out.println("En  " + cm  + " cm hay " + resultados + " pulgadas");
		
		
		//Declarar varias variables juntos
		int operador1,operador2,resultado;
		
		operador1 =8;
		operador2=7;
		resultado=operador1+operador2;
		
		System.out.println(resultado);

	}

}
