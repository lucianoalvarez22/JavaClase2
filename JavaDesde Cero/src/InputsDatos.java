import java.util.*;

public class InputsDatos {

	public static void main(String[] args) {
		
		//CLASE SCANNER NO son estaticos. Hay que crearse un objeto para usarlo
		
		Scanner entrada = new Scanner(System.in); //Creacion de objeto de tipo scanner "entrada"
		
		System.out.println("Introduce tu nombre: "); //Imprimir en pantalla un mensaje
		
		String nombre_usuario = entrada.nextLine(); //Creamos una variable de tipo String para almacenar el dato de entrada. NextLine devuelve un string
		
		System.out.println("Introduce edad: ");
		
		int edad_usuario = entrada.nextInt(); //NEXTINT devuelve un numero entero y lo almacena en la variable edad_usuario
		
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad_usuario+1) + " años" );

	}

}
