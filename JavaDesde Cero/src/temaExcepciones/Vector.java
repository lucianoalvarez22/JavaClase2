package temaExcepciones;

public class Vector {
	private int x;
	private int y;
	
	private static int numMaximo = 20;
	private static int numMinimo = 5;

	public Vector(int x, int y) {
		this.x= (x<numMinimo ? numMinimo: x>numMaximo ? numMaximo : x);
		this.y= (y<numMinimo ? numMinimo: y>numMaximo ? numMaximo : y); 
	}

	public Vector(int num) {
		this(num, num);
	}
	
	

	public Vector suma(Vector vectorNuevo) throws VectorOutOfBoundsException {
		int sumaX = this.x + vectorNuevo.x;
		int sumaY = this.y + vectorNuevo.y;
		if(sumaX > numMaximo || sumaX < numMinimo || sumaY > numMaximo || sumaY < numMinimo) {
			throw new VectorOutOfBoundsException("VectorOutOfBoundsException");
		}
		
		return new Vector(sumaX, sumaY);	
	}
	
	

	

	@Override
	public String toString() {
		return "Vector x=" + x + ", y=" + y + "";
	}

	public static void main(String[] args) {

		Vector v1 = new Vector(10, 6);
		Vector v2 = new Vector(3,5);
		
		try {
			Vector vectorResultadoSuma = v1.suma(v2);
			System.out.println(vectorResultadoSuma.toString());
		} catch (VectorOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("---------------------------");
		
//		Vector vectorSecondConstructor = new Vector(5);
//		
//		Vector vectorResultadoSecondConstructor = vectorSecondConstructor.suma(v2);
//		System.out.println(vectorResultadoSecondConstructor.x);
//		System.out.println(vectorResultadoSecondConstructor.y);
		
	}

}
