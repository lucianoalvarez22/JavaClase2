package misfiguras;

public class Circulo extends Figura {
	private int radio;
	private final static double PI = 3.1416;

	private Circulo(String color, int radio) {
		super(color);
		this.radio = radio;
	}

	public Circulo() {
		this("Blanco", 1);
	}

	public Circulo(int radio) {
		this("Blanco", radio);
	}

	public Circulo(double superficie) {
		this("Blanco", (int) Math.sqrt(superficie / PI));
	}

	// GET SET
	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public static double getPi() {
		return PI;
	}

	// metodos
	public double superficie() {
		return PI * radio * radio;
	}

	public double perimetro() {
		return 2 * PI * radio;
	}



	@Override
	public String toString() {
		return "Circulo [color=" + getColor() + ", radio=" + radio + ", superficie()=" + superficie()
				+ ", perimetro()=" + perimetro() + "]";
	}

}
