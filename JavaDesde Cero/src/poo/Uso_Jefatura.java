package poo;

public class Uso_Jefatura {
	
	private double incentivo;

	
	
	public void estableceIncentivo(double b) {
		incentivo=b;
		
	}
	
	public double dameSueldo() {
		double sueldoJefe = dameSueldo();
		return sueldoJefe+incentivo; 
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
