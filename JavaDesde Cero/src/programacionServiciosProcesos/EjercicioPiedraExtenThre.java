package programacionServiciosProcesos;

public class EjercicioPiedraExtenThre extends Thread {
	private int segundos;
	private String nombre;
	private static final int milis = 1000;

	public EjercicioPiedraExtenThre(String nombre, int segundos) {
		this.nombre = nombre;
		this.segundos = segundos;
	}

	public void lanzar3() {
		
		for (int tiempo = 1; tiempo <= segundos; tiempo++) { 
            double ecuacionAltura = 5 * tiempo - 0.5 * tiempo * tiempo;
            System.out.println(this.nombre + "Tiempo: " + tiempo + " segundos - Altura: " + ecuacionAltura + " metros");
            try {
				Thread.sleep(milis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}

	}

	
	public void run() {
		lanzar3();
		
	}
	
	public static void main(String[] args) {
		
		EjercicioPiedraExtenThre p7 = new EjercicioPiedraExtenThre("Piedra 1: ", 4);
		EjercicioPiedraExtenThre p8 = new EjercicioPiedraExtenThre("Piedra 2: ", 2);
		EjercicioPiedraExtenThre p9 = new EjercicioPiedraExtenThre("Piedra 3: ", 3);
		
		p7.start();
		p8.start();
		p9.start();
	}

}
