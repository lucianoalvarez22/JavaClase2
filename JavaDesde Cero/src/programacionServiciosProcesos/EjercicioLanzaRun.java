package programacionServiciosProcesos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EjercicioLanzaRun {

	public static void main(String[] args) {
		
		EjercicioLanzabolas l1 = new EjercicioLanzabolas("bola1");
		EjercicioLanzabolas l2 = new EjercicioLanzabolas("bola2");
		EjercicioLanzabolas l3 = new EjercicioLanzabolas("bola3");
		
		ExecutorService executor1 = Executors.newFixedThreadPool(3);
        ExecutorService executor2 = Executors.newFixedThreadPool(1);
        ExecutorService executor3 = Executors.newFixedThreadPool(6);
        
        
        //Pool fijo de 3 hilos en 3 tareas
//        executor1.execute(l1);
//        executor1.execute(l2);
//        executor1.execute(l3);
        
        //Pool fijo de 1 hilo para 9 tareas
//        for(int i=0; i<3; i++) {
//        	executor2.execute(l1);
//        	executor2.execute(l2);
//        	executor2.execute(l3);
//        }
        
        
        //Pool fijo de 9hilo para 9 tareas
        for(int i=0; i<3; i++) {
        	executor3.execute(l1);
        	executor3.execute(l2);
        	executor3.execute(l3);
        }
        
        executor1.shutdown();
        executor2.shutdown();
        executor3.shutdown();

	}

}
