package temaFicheros;

import java.util.Random;

public class EjercicioCosa {

	private int num;
	private char letra;
	private static Random random = new Random();

	public EjercicioCosa() {
		num = random.nextInt(10) + 1;
		letra = (char)(random.nextInt('Z' - 'A' + 1) + 'A');
	}

	public EjercicioCosa(int num, char letra) {
		this.num = num;
		this.letra = letra;
	}

	public String datosFormateados() {
		return String.format("%d, %c%n", num, letra); 
	}

}
