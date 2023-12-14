package _collections;

import java.util.Random;

public enum Color {
	
	RO("ROJO"), NA("NARANJA"), AM("AMARILLO"), VE("VERDE"), AZ("AZUL"), IN("INDIGO"), VI("VIOLETA");

	private Color(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	

	public String getNombreCompleto() {
		return nombreCompleto; 
	}
	
	public static Color dameColorAleatorio() {
		Random r = new Random();
		return Color.values()[r.nextInt(Color.values().length)];
		
	}



	private String nombreCompleto;

}
