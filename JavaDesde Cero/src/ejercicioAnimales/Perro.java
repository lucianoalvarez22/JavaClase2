package ejercicioAnimales;

public class Perro extends Animal {
	
	public Perro(int peso) {
		super(peso);
	}

	public void saludar() {
		System.out.println("Soy un Perro de " + getPeso() + " kg");
	}

}
