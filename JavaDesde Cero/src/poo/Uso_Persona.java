package poo;

public class Uso_Persona {
	
	



	public static void main(String[] args) {
		
		Persona[] lasPersonas = new Persona[2];
		lasPersonas[0] = new Empleado("Luis Conde", 5000, 2009, 02, 25);
		lasPersonas[1] = new Alumno("Luciano Alvarez", "Programación");
		
		//Bucle for Each
		for (Persona p: lasPersonas) {
			System.out.println(p.dameNombre() + " : " + p.dameDescripcion());
		}
		

	}

}
