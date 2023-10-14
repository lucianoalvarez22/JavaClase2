
public class ClaseString {

	public static void main(String[] args) {
		
		//Metodo Length devuelve la longitud de una cadena de caracteres
		//Metoto charAt(n) devuelve la posicion de un caracter (empieza desde 0)
		//Metodo substring(x,y) devuelve una subcadena dentro de la cadena
		//Metodo equals(cadena) devuelve si dos cadenas que se comparan son iguales o no. Distingue de Mayus y Minus
		//Metodo equalsIgnoreCase(cadena) igual que la anterior pero no tiene en cuenta mayus y minus
		
		String nombre="Luciano";
		System.out.println("Mi nombre es " + nombre);
		
		System.out.println("Mi nombre tiene " + nombre.length() + " letras");
		
		System.out.println("La primera letra de  " + nombre + " es la " + nombre.charAt(0));
		
		//Pedir la ultima letra de una cadena
		int ultima_letra;
		ultima_letra = nombre.length();
		
		System.out.println("Y la ultima letra es la " + nombre.charAt(ultima_letra-1));

	}

}
