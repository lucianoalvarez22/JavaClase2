
public class ClaseString2 {

	public static void main(String[] args) {
		
		String frase = "Hoy es un estupendo dia para aprender a programar en Java";
		
		//Sacar una subcadena dentro de la misma cadena
		String frase_resumen = frase.substring(0, 29) + "irnos a la playa y olvidarnos de todo" + " y " +
		frase.substring(29, 57);//Concatenar metodos con caracteres
		System.out.println(frase_resumen);



	}

}
