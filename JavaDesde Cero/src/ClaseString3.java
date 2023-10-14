
public class ClaseString3 {

	public static void main(String[] args) {
		
		//METODO EQUALS PARA COMPARAR CARACTERES Y DISTINGUE ENTRE MAYUS Y MINUS
		String alumno1, alumno2;
		
		alumno1 = "luciano";
		alumno2 = "Luciano";
		
		System.out.println(alumno1.equals(alumno2)); //DEVUELVE TRUE O FALSE
		
		//METODO EQUALS IGNORE CASE NO DISTINGUE DE MAYUSCULAS O MINUSCULAS
		System.out.println(alumno1.equalsIgnoreCase(alumno2));

	}

}
