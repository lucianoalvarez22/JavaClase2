
import java.util.*;
public class Uso_Tallas {
	//DECLARAR VARIABLES DE TIPO ENUM(ENUMERADO) ALMACENAR UN GRUPO DE VALORES Y SOLO SE PONDRÁ ALMACENAR ESE GRUPO DE VALORES
	// NO SE PUEDE DECLARAR DENTRO DEL MAIN
	//LOS TIPO ENUM PERMITE CONSTRUCTORES Y LOS GETTERS Y SETTERS
	//NO ADMITEN LA CREACION DE OBJETOS
	
	//enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE};
	
	enum Talla {
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		//contructor
		private Talla (String abreviatura) {
			this.abreviatura = abreviatura;
		}
		
		public String dameAbreviatura(){
			return abreviatura;
		}
		private String abreviatura;
	}

	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY GRANDE");
		
		String entradaDatos = entrada.next().toUpperCase();
		
		Talla la_talla = Enum.valueOf(Talla.class, entradaDatos);
		
		System.out.println("Talla = " + la_talla);
		System.out.println("Abrevaitura = " + la_talla.dameAbreviatura());
		
	}

}
