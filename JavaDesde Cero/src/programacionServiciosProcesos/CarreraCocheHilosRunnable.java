package programacionServiciosProcesos;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CarreraCocheHilosRunnable implements Runnable {
	
	private String nombre;
	private int posicionX;
	private int velocidad;
	private static int longitud = 100;
	
	private static Random ran = new Random();
	
	
	public CarreraCocheHilosRunnable(String nombre) {
		this.nombre = nombre;
		this.posicionX = ran.nextInt(0,longitud/2);
		this.velocidad = ran.nextInt(5, 16);
	}
	
	@Override
	public void run() {
		for(int i=posicionX; i<longitud; i+=velocidad) {
			posicionX = i;
			System.out.printf("El coche %s se encuentra en %d de %d%n", nombre, posicionX, longitud);
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				System.out.println("Error" + e);
			}
			
		}
		
		System.out.printf("El coche %s ha llegado a la meta\n", nombre);
	}

	public static void main(String[] args) {
		
//		CON RUNNABLE Y CREANDO UN HILO CON LAMBDAS
		CarreraCocheHilosRunnable coche1 = new CarreraCocheHilosRunnable("Coche 1");
		CarreraCocheHilosRunnable coche2 = new CarreraCocheHilosRunnable("Coche 2");
		
		Thread t1 = new Thread(coche1);
		Thread t2 = new Thread(coche2);
		
		t1.start();
		t2.start();
		
		Thread t3 = new Thread(
				() -> {
					for(int i=0; i<100; i+=2) {
						System.out.printf("El coche %s se encuentra en %d de %d%n", "fantasma", i, 100);
						try {
							Thread.sleep(0);
						} catch (InterruptedException e) {
							System.out.println("Error" + e);
						}
						
					}
					
					System.out.printf("El coche %s ha llegado a la meta\n", "fantasma");
					
				});
		
		t3.start();
		
		ExecutorService executorUno = Executors.newFixedThreadPool(1);
		executorUno.execute(new CarreraCocheHilosRunnable("Executer Coche 1"));
		executorUno.execute(new CarreraCocheHilosRunnable("Executer Coche 2"));
		executorUno.execute(new CarreraCocheHilosRunnable("Executer Coche 3"));
		executorUno.execute(new CarreraCocheHilosRunnable("Executer Coche 4"));
		executorUno.execute(new CarreraCocheHilosRunnable("Executer Coche 5"));
		executorUno.execute(new CarreraCocheHilosRunnable("Executer Coche 6"));
		
		executorUno.shutdown();
		

	}

}
