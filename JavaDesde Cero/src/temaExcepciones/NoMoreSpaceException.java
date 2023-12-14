package temaExcepciones;

public class NoMoreSpaceException extends Exception {
	
	String msj;
	
	public NoMoreSpaceException(String msj) {
		super(msj);
	}

}
