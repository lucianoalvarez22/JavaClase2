package funcintlambdas;

public class CalculoEnteroADouble {
	
	@FunctionalInterface
	interface UsaEnterosDevuelveDouble {
		double funcionalDouble(double x);
	}
	
	@FunctionalInterface
	interface UsaEnterosNDevuelveDouble{
		double funcionDosDouble(double x, double n);
	}
	
	public static void main(String[] args) {
		double x = 5;
		double n = 6;
		CalculoEnteroADouble calcDouble = new CalculoEnteroADouble();
		
		System.out.println("INTERFAZ FUNCIONAL");
		
		UsaEnterosDevuelveDouble mitad = s -> s/2;
		UsaEnterosDevuelveDouble cuarta = s -> s/4;
		UsaEnterosDevuelveDouble decima = s -> s/10;
		UsaEnterosNDevuelveDouble nsima = (double x1, double n1) -> x1/n1; 
		
		System.out.println(mitad.funcionalDouble(x));
		System.out.println(cuarta.funcionalDouble(x));
		System.out.println(decima.funcionalDouble(x));
		System.out.println(nsima.funcionDosDouble(x, n));
		
	}

}
