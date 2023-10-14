
public class ClaseMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Math.sqrt devuelve un numero decimal y calcula la raiz cuadrada
		//Math.pow Calcula la potencia de un numero. Recibe dos parametros, base y exponente
		//Math.round para redondear un numero
		//Math.PI es una constante de clase con el numero PI
		
	//METODO SQRT	
	 double raiz= Math.sqrt(9); //El dato hay que guardarlo en un duoble y recibe como parametro un double.
	// System.out.println(raiz); //Imprime 3.0 porque nos devuelve es un double
	 
	 
	 //METODO RANDOM
	 double num1 = 5.85;
	 //int resultado = Math.round(num1); Da error porque el metodo round devuelve un long y los estamos guardando en un int
	 
	 int resultado = (int)Math.round(num1); //Hacemos una refundicion - Consiste en convertir un tipo de dato en otro.
	 //System.out.println(resultado);
	 
	 
	 //METODO POW
	 double base=5;
	 double exponente=3;
	 double solucion = Math.pow(base, exponente);
	 System.out.println(solucion);
	 
	 
	 

	}

}
