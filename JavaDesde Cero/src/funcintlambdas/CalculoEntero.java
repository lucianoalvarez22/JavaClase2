package funcintlambdas;

public class CalculoEntero {
	
	@FunctionalInterface
	public interface UsaIntDevuelveInt {
		int m(int x);
	}
	
	@FunctionalInterface
	public interface UsaCuatroIntYDevuelveInt {
		int enteros(int a, int b, int c, int x);
	}
	public static void main(String[] args) {
		
		
		
		int x = 3;
		int a = 20;
		int b = 12;
		int c = 9;
		
		
		System.out.println("Interfaz Funcional");
		
		
		UsaIntDevuelveInt cuadrado = s -> s * s;
		UsaIntDevuelveInt cubo = s -> s * s * s;
		UsaIntDevuelveInt triple = s -> s * 3;
		UsaIntDevuelveInt doble = s -> s * 2;
		UsaIntDevuelveInt polinomio = s -> 5*s^3+7*s^2+9;
		//UsaCuatroIntYDevuelveInt polinomioVariable = s -> s*s^3+s*s^2+s;
		UsaCuatroIntYDevuelveInt polinomioVariable = ( a1, b1, c1, x1) -> a1*x1^3+b1*x1^2+c1;
		
		System.out.println(cuadrado.m(x));
		System.out.println(cubo.m(x));
		System.out.println(triple.m(x));
		System.out.println(doble.m(x));
		System.out.println(polinomio.m(x));
		System.out.println(polinomioVariable.enteros(a, b, c, x)); 
		
	}

}
