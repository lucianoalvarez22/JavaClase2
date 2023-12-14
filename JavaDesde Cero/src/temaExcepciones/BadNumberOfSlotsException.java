package temaExcepciones;

public class BadNumberOfSlotsException extends Exception {
	
	public String msj;
	
	public BadNumberOfSlotsException(String msj) {
		super(msj);
		
	}
}
