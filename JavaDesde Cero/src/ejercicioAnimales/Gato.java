package ejercicioAnimales;

public class Gato extends Animal {
	
	public Gato(int peso) {
		super(peso);
	}

	public void saludar() {
		System.out.println("Soy un Gato de " + getPeso() + " kg" );
	}


}
