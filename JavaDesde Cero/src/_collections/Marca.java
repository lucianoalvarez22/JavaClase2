package _collections;

import java.util.Random;

public enum Marca {

	VO("VOLKSWAGEN"), FE("FERRARI"), AU("AUDI"), OP("OPEL"), SE("SEAT");

	private Marca(String nomComp) {
		nomCompleto = nomComp;
	}

	public String getNomCompleto() {
		return nomCompleto;
	}

	private String nomCompleto;
	
	public static Marca dameMarcaAleatorio() {
		Random r2 = new Random();
		return Marca.values()[r2.nextInt(Marca.values().length)];
	}

}
