package funcintlambdas;

import java.util.ArrayList;
import java.util.List;

public class MetodoInterfazFuncional {
	
	private static List<Integer> filtra(List<Integer> listaOriginal, InterEnterosMetodo intFunc) {
		List<Integer> listaFinal = new ArrayList<Integer>(); 
		
		for(int numero: listaOriginal) {
			
			if(intFunc.devuelvoMayor(numero))
				listaFinal.add(numero);
		}
		return listaFinal;
		
	}
	
	@FunctionalInterface
	public interface InterEnterosMetodo {
		boolean devuelvoMayor(int x);
	}
	

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(20);
		arrayList.add(15);
		arrayList.add(34);
		
		InterEnterosMetodo mayorEdad = x -> x>18; 
	
		System.out.println(filtra(arrayList, mayorEdad)); 
		System.out.println(MetodoInterfazFuncional.filtra(arrayList, mayorEdad));
		
	}

}
