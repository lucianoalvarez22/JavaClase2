package programacionServiciosProcesos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EjercicioLanzabolas implements Runnable {
	
	private String nombre;
	
	

	public EjercicioLanzabolas(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public void run() {
		
		LocalDateTime ahora = LocalDateTime.now();
        // Formatear la hora para mostrar horas, minutos, segundos y milisegundos
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
		
		System.out.println("Lanzando bolas desde " + this.nombre + " a las " + ahora.format(formatter) );
		
	}


}
