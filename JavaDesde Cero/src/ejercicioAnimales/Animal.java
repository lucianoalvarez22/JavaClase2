package ejercicioAnimales;

public class Animal {
	
	private int peso;
	
	
	
	public Animal(int peso) {
		this.peso = peso;
	}

	
	

	public int getPeso() {
		return peso;
	}




	public void setPeso(int peso) {
		this.peso = peso;
	}




	public void saludar() {
		System.out.println("Soy un Animal");
	}
	
}
