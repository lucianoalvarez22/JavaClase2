package poo;

public class Alumno extends Persona {
	
	private String carrera;

	public Alumno(String nom, String carreU) {
		super(nom);
		carrera = carreU;
	}

	@Override
	public String dameDescripcion() {
		// TODO Auto-generated method stub
		return "El alumno está estudiando la carrera de " + carrera;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
