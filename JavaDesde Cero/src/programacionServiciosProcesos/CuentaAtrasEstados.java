package programacionServiciosProcesos;

public class CuentaAtrasEstados implements Runnable {

	private static final long milis = 100;
	private int star;
	private String name;

	public CuentaAtrasEstados(int star, String name) {
		this.star = star;
		this.name = name;
	}

	@Override
	public void run() {

		for (int i = star; i >= 0; i--) {
			System.out.printf("%s: %d%n", name, i);
			try {
				Thread.sleep(milis);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} // Esperamos un tiempo razonable para que terminado
		}
		

	}

	public static void main(String[] args) {

		CuentaAtrasEstados cuenta1 = new CuentaAtrasEstados(5, "C1");
		CuentaAtrasEstados cuenta2 = new CuentaAtrasEstados(5, "C2");
		
		// Estado NEW: hilo creado pero no arrancado
		Thread thread1 = new Thread(cuenta1);
		Thread thread2 = new Thread(cuenta2);
		System.out.printf("%s - Estado: %s%n", thread1.getName(), thread1.getState());
		
		
		// Estado RUNNABLE: hilo arrancado pero puede estar o no funcionando
		thread1.start();
		thread2.start();
		System.out.printf("%s - Estado: %s%n", thread1.getName(), thread1.getState());

		while (thread1.isAlive()) {
			// Estado TIMED_WAITING: en espera debido a Thread.sleep()
			System.out.printf("%s - Estado: %s%n", thread1.getName(), thread1.getState());
			try {
				// Tiempo de espera
				Thread.sleep(milis / 3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		while (thread2.isAlive()) {
			// Estado TIMED_WAITING: en espera debido a Thread.sleep()
			System.out.printf("%s - Estado: %s%n", thread2.getName(), thread2.getState());
			try {
				// Tiempo de espera
				Thread.sleep(milis / 3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Estado TERMINATED: terminado
		System.out.printf("%s - Estado: %s%n", thread1.getName(), thread1.getState());
		System.out.printf("%s - Estado: %s%n", thread2.getName(), thread2.getState());

	}

}
