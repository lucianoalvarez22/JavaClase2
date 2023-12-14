package _collections;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(Color.AM.getNombreCompleto());
		
		System.out.println(Marca.AU.getNomCompleto());
		
		
		Coche c1 = new Coche();
		Coche c2 = new Coche();
		Coche c3 = new Coche();
		Coche c4 = new Coche();
		Coche c5 = new Coche();
		Coche c6 = new Coche();
		
//		System.out.println(c1.toString());
		
//		System.out.println(c1.toString());
//		System.out.println(c2.toString());
		
		System.out.println("------------PARKING--------------");
		
		Parking p1 = new Parking("Mi primer parking", 8);
		
		
		p1.entraCoche(c1);
		p1.entraCoche(c2);
		p1.entraCoche(c3);
		p1.entraCoche(c3);
		p1.entraCoche(c4);
		p1.entraCoche(c3);
		
		//System.out.println(p1.vaciaParking());
		
		p1.reportParking();
		
		p1.reportColores();
		
		
		

	}

}
