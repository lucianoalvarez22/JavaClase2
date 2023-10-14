package ejercicioAnimales;

public class Test {

	public static void main(String[] args) {
		Animal a1 = new Animal(69);
		a1.saludar();
		
		Gato g1 = new Gato(89);
		g1.saludar();
		System.out.println(g1.getPeso());
		
		Perro p1 = new Perro(45);
		p1.saludar();
		System.out.println(p1.getPeso());
		
		
		Murcielago m1 = new Murcielago(23);
		m1.saludar();
		System.out.println(m1.getPeso());

	}

}
