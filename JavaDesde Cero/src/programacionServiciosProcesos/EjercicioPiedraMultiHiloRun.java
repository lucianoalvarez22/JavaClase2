package programacionServiciosProcesos;

public class EjercicioPiedraMultiHiloRun implements Runnable {
	
	private int segundos;
	private String nombre;
	private static final int milis = 1000;

	public EjercicioPiedraMultiHiloRun(String nombre, int segundos) {
		this.nombre = nombre;
		this.segundos = segundos;
	}

	public void lanzar2() {
		
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

	@Override
	public void run() {
		lanzar2();
		
	}
	
	public static void main(String[] args) {
		
		EjercicioPiedraMultiHiloRun p4 = new EjercicioPiedraMultiHiloRun("Piedra 1: ", 4);
		EjercicioPiedraMultiHiloRun p5 = new EjercicioPiedraMultiHiloRun("Piedra 2: ", 2);
		EjercicioPiedraMultiHiloRun p6 = new EjercicioPiedraMultiHiloRun("Piedra 3: ", 3);
		
		new Thread(p4).start();
		new Thread(p5).start();
		new Thread(p6).start();
	}


}
