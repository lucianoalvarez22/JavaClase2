package misfiguras;

public class MainArrays {

	public static void main(String[] args) {

		// array de figuras
		Figura[] figurasArr = {new Circulo(45), new Cuadrado(96), new Cuadrado(100),  new Rectangulo(0)};
		
		
		// array de pisos
		Piso[] pisosArr = {new Piso(30), new Piso(70), new Piso(90), new Piso(45), new Piso(56)}; 
		
		//Superficiable[] superfic = Utils.juntaArrays(figurasArr);
		Superficiable[] superfic2 = Utils.juntaArrays(figurasArr, pisosArr);
		
		
		//Suma de todas las superficies
		double sumaTotal = 0;
		for (Superficiable elem : superfic2) {
			sumaTotal += elem.superficie();
		}
		
		System.out.println("La suma total de la superficie es " + sumaTotal);
		
	
//		for (int i = 0; i < figurasArr.length; i++) {
//			superArr[i] = figurasArr[i];
//			if (i < figurasArr.length - 1) {
//				for (int j = 0; j < pisosArr.length; j++)
//					superArr[j + 4] = pisosArr[j];
//			}
//		}
	

	}

}
