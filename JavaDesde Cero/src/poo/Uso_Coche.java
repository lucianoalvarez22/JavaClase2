package poo;

public class Uso_Coche {

	public static void main(String[] args) {
		
		Coche Renault = new Coche(); //INSTANCIAR UNA CLASE. EJEMPLAR DE CLASE
		
		Renault.estableceColor("Amarillo");
		
		System.out.println(Renault.dimeDatosGenerales());
		
		System.out.println(Renault.dimeColor());
		
		Renault.configuraAsientos("si");
		System.out.println(Renault.dimeAsientos());

	}

}
