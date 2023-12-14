package _collections;

import java.util.Random;

public class Coche {
	
	private Color color;
	private Marca marca;
	
	public Coche(Color color, Marca marca) {
		this.color = color;
		this.marca = marca;
	}

	public Coche() {
		this.color = Color.dameColorAleatorio();
		this.marca = Marca.dameMarcaAleatorio();
	}
	
	

	public Color getColor() {
		return color;
	}

	public Marca getMarca() {
		return marca;
	}

	@Override
	public String toString() {
		return "Coche: color=" + color + ", marca=" + marca + "";
	}
	
	
	
	

}
