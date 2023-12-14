package programacionServiciosProcesos;

public class EjercicioPiedraMonoHilo {

	private int segundos;
	private String nombre;
	private static final int milis = 1000;

	public EjercicioPiedraMonoHilo(String nombre, int segundos) {
		this.nombre = nombre;
		this.segundos = segundos;
	}

	public void lanzar() {
		
		for (int tiempo = 1; tiempo <= segundos; tiempo++) { 
            double ecuacionAltura = 5 * tiempo - 0.5 * tiempo * tiempo;
            System.out.println(this.nombre + "Tiempo: " + tiempo + " segundos - Altura: " + ecuacionAltura + " metros");
            try {
				Thread.sleep(milis);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		
		EjercicioPiedraMonoHilo p1 = new EjercicioPiedraMonoHilo("Piedra 1: ", 4);
		EjercicioPiedraMonoHilo p2 = new EjercicioPiedraMonoHilo("Piedra 2: ", 2);
		EjercicioPiedraMonoHilo p3 = new EjercicioPiedraMonoHilo("Piedra 3: ", 3);
		
		p1.lanzar();
		p2.lanzar();
		p3.lanzar();
	}

}
