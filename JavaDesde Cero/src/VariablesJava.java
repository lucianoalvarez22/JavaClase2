
public class VariablesJava {

	public static void main(String args[]) {
		
		//Definimos la variable
		int miVariableEntera = 10;
		System.out.println(miVariableEntera);
		
		//Modificamos el valor de la variable
		miVariableEntera = 5;
		System.out.println(miVariableEntera);
		
		String miVariableCadena = "Saludos";
		System.out.println(miVariableCadena);
		
		miVariableCadena = "Adios";
		System.out.println(miVariableCadena);
		
		//Var - Inferencia de tipos en Java
		var miVariableEntera2 = 15;
		System.out.println(miVariableEntera2);
		
		var miVariableCadena2 = "Nueva Cadena";
		System.out.println(miVariableCadena2);
		
		
		//PILDORAS VARIABLES
		
		int edad = 35; //Declaracion e iniciacion de variable en una unica linea
		
		/*La siguiente instruccion imprime en la consola (System.out) el valor de
		 * la variable edad
		*/
		System.out.println(edad);
		
		edad = 75; 
		System.out.println(edad);
	}

}
