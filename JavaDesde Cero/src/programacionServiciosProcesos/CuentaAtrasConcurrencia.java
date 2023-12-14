package programacionServiciosProcesos;

public class CuentaAtrasConcurrencia implements Runnable {

	private int valorInicial;
	private String nombre;
	private static long ejecuciones = 0;
	private long ejecucionesInstancia;
	private final static int milis = 1;

	private CuentaAtrasConcurrencia(int valorInicial, String nombre) {
		this.valorInicial = valorInicial;
		this.nombre = nombre;
	}

	private void arranca() {
		for (int i = valorInicial; i >= 0; i--) {
			System.out.printf("%s: %d%n", nombre, i);
			ejecuciones++;
			ejecucionesInstancia++;
			try {
				Thread.sleep(milis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		arranca();

	}

	public static void main(String[] args) {
		CuentaAtrasConcurrencia c1 = new CuentaAtrasConcurrencia(4, "C1");
		int veces = 100000;
		for (int i = 0; i < veces; i++) {
			new Thread(c1).start();
		}
		try {
			Thread.sleep(milis * veces / 10); // Esperamos un tiempo razonable para que terminado
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.printf("Ejecuciones: %d%n", ejecuciones);
		System.out.printf("Ejecuciones de instancia: %d%n", c1.ejecucionesInstancia);
	}

}
