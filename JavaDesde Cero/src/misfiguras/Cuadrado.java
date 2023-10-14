package misfiguras;

public class Cuadrado extends Figura {
	// Atributo
	private int lado;

	private Cuadrado(String color, int lado) {
		super(color);
		this.lado = lado;
	}

	public Cuadrado() {
		this("Blanco", 1);
	}

	public Cuadrado(double superficie) {
		this("Blanco", (int) Math.sqrt(superficie));
	}

	// Getters and Setters
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	// METODOS

	@Override
	public double perimetro() {
		return 4 * lado;
	}

	// Calcular el área ( lado * lado)

	@Override
	public double superficie() {
		return lado * lado;
	}

	// toString que te parezca adecuado.
	public String toString() {
		return "El color del cuadrado es " + getColor() + ". Y el lado introducido es " + lado
				+ ". El area del cuadrado es " + superficie() + ". El perimetro es " + perimetro();
	}

}
