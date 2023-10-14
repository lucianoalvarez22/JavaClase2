package misfiguras;

public class Rectangulo extends Figura {

	// Atributos
	private int base;
	private int altura;

	private Rectangulo(String color, int base, int altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo() {
		this("Blanco", 2, 1);
	}

	public Rectangulo(double superficie) {
		this("Blanco", 2 * (int) Math.sqrt(superficie / 2), (int) Math.sqrt(superficie / 2));
	}

	// Getters and Setter

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	// METODOS

	@Override
	public double superficie() {
		return base * altura;
	}

	@Override
	public double perimetro() {
		return (base + altura) * 2;
	}

	
	// TO STRING
	@Override
	public String toString() {
		return "Rectangulo [color=" + getColor() + ", base=" + base + ", altura=" + altura + 
				  ", superficie() = " + superficie() + ", perimetro() = " + perimetro() + "]";
	}

}
