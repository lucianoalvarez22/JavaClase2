package curso2324;

public class EjercicioForMultiplo {

	public static void main(String[] args) {
		
		int numElem = 50_000;
		int multiploDe = 2;
		int inicio = 800;
		int primerMultiploDe = 0;
		int[] array = new int[numElem];

		// Buscando el primer multiplo de multiploDe 
		// empezando por inicio
		primerMultiploDe = ((inicio - 1)/multiploDe+1) * multiploDe;

		// Relleno del array invertido con los múltipos pedidos
//		for (int i = 0; i < array.length; i++) {
//			array[i] = primerMultiploDe + (array.length - i - 1) * multiploDe;
//		}

		// Cálculo de la suma
		
		//Calculo de la suma de los numElem a partir de primer multipls
		long suma = (primerMultiploDe + primerMultiploDe + multiploDe * numElem - 1) / 2 * numElem;
		System.out.println(suma);
//		for(int elem: array) suma += elem;
//		System.out.println("Suma: " + suma);
		
		
		
		
	}

}
