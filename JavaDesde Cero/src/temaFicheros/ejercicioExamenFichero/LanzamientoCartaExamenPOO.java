package temaFicheros.ejercicioExamenFichero;
import java.util.Random;

public class LanzamientoCartaExamenPOO {
	
	private String[] arrayCartaPalo = { "trebol", "picas", "diamante", "corazones", "Joker"};
	private String cartaPaloAleatorio;

	private String[] arrayCartaValor = {"AS", "2", "3", "4", "5", "6", "7", "8", "9", "10",
			"J", "Q", "K" };
	private String cartaValor; 


	private int[] arrayDadoUno = { 1, 2, 3, 4, 5, 6 };
	private int dadoUnoAleatorio;

	private int[] arrayDadoDos = { 1, 2, 3, 4, 5, 6 };
	private int dadoDosAleatorio;

	private String[] arrayMoneda = { "cara", "cruz" };
	private String monedaAleatorio;
	
	private String[] arrayJoker = {"BYN", "Color"};
	
	private Random ran = new Random();
	
	

	public LanzamientoCartaExamenPOO() {
		this.cartaPaloAleatorio = arrayCartaPalo[ran.nextInt(arrayCartaPalo.length)];
		this.cartaValor = arrayCartaValor[ran.nextInt(arrayCartaValor.length)];
		this.dadoUnoAleatorio = arrayDadoUno[ran.nextInt(arrayDadoUno.length)];
		this.dadoDosAleatorio = arrayDadoDos[ran.nextInt(arrayDadoDos.length)];
		this.monedaAleatorio = arrayMoneda[ran.nextInt(arrayMoneda.length)];
		
		if(this.cartaPaloAleatorio == "Joker") {
			this.cartaValor = arrayJoker[ran.nextInt(arrayJoker.length)];
		}
	}
	
	



	public String getCartaPaloAleatorio() {
		return cartaPaloAleatorio;
	}

	public String getCartaValor() {
		return cartaValor;
	}

	public int getDadoUnoAleatorio() {
		return dadoUnoAleatorio;
	}



	public int getDadoDosAleatorio() {
		return dadoDosAleatorio;
	}


	public String getMonedaAleatorio() {
		return monedaAleatorio;
	}

	@Override
	public String toString() {
		return dadoUnoAleatorio + "|" + dadoDosAleatorio + "|" + monedaAleatorio + "|" + cartaPaloAleatorio + "|" + cartaValor;
	}
	
	

}
