package funcintlambdas;

public class CalculoString {

	public boolean iguales(String param1, String param2) {
		if (param1.equalsIgnoreCase(param2))
			return true;
		else {
			return false;
		}
	}

	public boolean contiene(String param1, String param2) {
		param1 = param1.toLowerCase();
		param2 = param2.toLowerCase();
		if (param1.contains(param2)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean numMenosTres(String param1) {
		if (param1.length() < 3) {
			return true;
		} else {
			return false;
		}
	}

	public boolean empiezaA(String param1) {
		param1 = param1.toLowerCase();
		if (param1.startsWith("a")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean terminaPunto(String param1) {
		if (param1.endsWith(".")) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean instanciaCaracter(String param1, String caracter) {
		if(param1.contains(caracter)) {
			return true;
		}else { 
			return false;
		}
	}

	@FunctionalInterface
	public interface UsaStringDevuelveTrue {
		public boolean calculo(String param1);
	}

	@FunctionalInterface
	public interface UsaDosStringDevuelveTrue {
		public boolean calculoDosString(String param1, String param2);
	}
	
	

	public static void main(String[] args) {

		String param1 = "AMANDA.";
		String param2 = "Hola";
		String caracter = "a";

		CalculoString calcstr = new CalculoString();
		System.out.println(calcstr.contiene(param1, param2));
		System.out.println(calcstr.iguales(param1, param2));
		System.out.println(calcstr.empiezaA(param1));
		System.out.println(calcstr.numMenosTres(param1));
		System.out.println(calcstr.terminaPunto(param2));

		System.out.println("INTERFAZ FUNCIONAL: ");

		UsaStringDevuelveTrue numMenosTres = s1 -> s1.length() < 3;
		System.out.println(numMenosTres.calculo(param1));

		UsaStringDevuelveTrue empiezaA =  s2 -> s2.toLowerCase().startsWith("a");
		System.out.println(empiezaA.calculo(param1));

		UsaStringDevuelveTrue terminaPunto =  s3 -> s3.toLowerCase().endsWith(".");
		System.out.println(terminaPunto.calculo(param1));

		UsaDosStringDevuelveTrue iguales = ( s4, s5) -> s4.equalsIgnoreCase(s5);
		System.out.println(iguales.calculoDosString(param1, param2));

		UsaDosStringDevuelveTrue contiene = ( s6, s7) -> s6.toLowerCase()
				.contains(s7.toLowerCase());
		System.out.println(contiene.calculoDosString(param1, param2));
		
		UsaDosStringDevuelveTrue instanciaCaracter = (s8,s9) -> s8.toLowerCase().contains(s9.toLowerCase());
		System.out.println(instanciaCaracter.calculoDosString(param1, caracter));
		
	}

}
