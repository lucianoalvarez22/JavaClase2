package programacionServiciosProcesos;

import java.util.Random;

public class CarreraCocheHilos extends Thread {
	
	private String nombre;
	private int posicionX;
	private int velocidad;
	private static int longitud = 100;
	
	private static Random ran = new Random();
	
	
	public CarreraCocheHilos(String nombre) {
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
		CarreraCocheHilos c1 = new CarreraCocheHilos("Coche 1");
		CarreraCocheHilos c2 = new CarreraCocheHilos("Coche 2");
		
		c1.start();
		c2.start();

	}

}
