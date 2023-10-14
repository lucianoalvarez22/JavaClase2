package ejercicioAnimales;

public class Murcielago extends Animal {
	
	public Murcielago(int peso) {
		super(peso);
	}
	
	

	public void saludar() {
		System.out.println("Soy un Murcielago de " + getPeso() + " kg");
	}

}
