package misfiguras;

public class Main {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		System.out.println(r1);
		
		Cuadrado c1 = new Cuadrado();
		System.out.println(c1);
		
		Circulo ci = new Circulo();
		System.out.println(ci);
		
		Superficiable s = (Superficiable) new Object();
		
		//array de figuras
		//array de pisos
		//aarray de superficiable que contenga los elementos del array de figuras y pisos
		
		
	}

}
