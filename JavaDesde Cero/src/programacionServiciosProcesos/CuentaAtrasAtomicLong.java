package programacionServiciosProcesos;

import java.util.concurrent.atomic.AtomicLong;

public class CuentaAtrasAtomicLong implements Runnable {

	private int valorInicial;
	private String nombre;
	private static AtomicLong ejecuciones = new AtomicLong();
	private AtomicLong ejecucionesInstancia = new AtomicLong(); // Usamos la clase AtomicLong
	private final static int milis = 1;

	private CuentaAtrasAtomicLong(int valorInicial, String nombre) { 
		this.valorInicial = valorInicial;
		this.nombre = nombre;
	}

	private void arranca() {
		for (int i = valorInicial; i >= 0; i--) {
			System.out.printf("%s: %d%n", nombre, i);
			ejecuciones.getAndIncrement();
			ejecucionesInstancia.getAndIncrement(); // Lo hacemos con get porque es una clase
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

		CuentaAtrasAtomicLong c1 = new CuentaAtrasAtomicLong(4, "C1");
		int veces = 100000;
		for (int i = 0; i < veces; i++) {
			new Thread(c1).start();
		}
		try {
			Thread.sleep(milis * veces / 10); // Esperamos un tiempo razonable para que terminado
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.printf("Ejecuciones: %d%n", ejecuciones.get()); 
		System.out.printf("Ejecuciones de instancia: %d%n", c1.ejecucionesInstancia.get()); // Lo llamamos con GET para
																							// que me lo dé

	}

}
