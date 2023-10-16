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

	@FunctionalInterface
	public interface UsaStringDevuelveTrue {
		public boolean calculo(String param1);
	}

	@FunctionalInterface
	public interface UsaDosStringDevuelveTrue {
		public boolean calculoDosString(String param1, String param2);
	}

//	public boolean instancia(String param1, char caracter) {
//		
//	}

	public static void main(String[] args) {

		String param1 = "AMANDA.";
		String param2 = "Hola";

		CalculoString calcstr = new CalculoString();
		System.out.println(calcstr.contiene(param1, param2));
		System.out.println(calcstr.iguales(param1, param2));
		System.out.println(calcstr.empiezaA(param1));
		System.out.println(calcstr.numMenosTres(param1));
		System.out.println(calcstr.terminaPunto(param2));

		System.out.println("INTERFAZ FUNCIONAL: ");

		UsaStringDevuelveTrue numMenosTres = (String paramNuevo) -> paramNuevo.length() < 3;
		System.out.println(numMenosTres.calculo(param1));

		UsaStringDevuelveTrue empiezaA = (String paramA) -> paramA.toLowerCase().startsWith("a");
		System.out.println(empiezaA.calculo(param1));

		UsaStringDevuelveTrue terminaPunto = (String paramPunto) -> paramPunto.toLowerCase().endsWith(".");
		System.out.println(terminaPunto.calculo(param1));

		UsaDosStringDevuelveTrue iguales = (String paramIgu, String paramIgu2) -> paramIgu.equalsIgnoreCase(paramIgu2);
		System.out.println(iguales.calculoDosString(param1, param2));

		UsaDosStringDevuelveTrue contiene = (String paramCont1, String paramCont2) -> paramCont1.toLowerCase()
				.contains(paramCont2.toLowerCase());
		System.out.println(contiene.calculoDosString(param1, param2));
	}

}
