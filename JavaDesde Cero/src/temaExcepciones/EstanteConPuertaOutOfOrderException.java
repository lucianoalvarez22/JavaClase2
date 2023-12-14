package temaExcepciones;

public class EstanteConPuertaOutOfOrderException extends Exception {
	
	String msj;
	
	public EstanteConPuertaOutOfOrderException(String msj) {
		super(msj);
	}

}
