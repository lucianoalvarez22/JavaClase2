package misfiguras;

public abstract class Figura implements Superficiable {
	private String color;

	public Figura(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public abstract double perimetro();

//	public abstract double superficie(); 

	public boolean comparaArea(Figura fig) { 

		return fig.superficie() == this.superficie() && fig.getClass() == this.getClass();
	}

}
