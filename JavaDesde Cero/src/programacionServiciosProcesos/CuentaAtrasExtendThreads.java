package programacionServiciosProcesos;

public class CuentaAtrasExtendThreads extends Thread {

	int valorInicial;
	String nombre;
	
	

	public CuentaAtrasExtendThreads(int valorInicial, String nombre) {
		this.valorInicial = valorInicial;
		this.nombre = nombre;
	}
	
	public void arranca2() {

		for(int i=valorInicial; i>=0; i--) {
			System.out.println(this.nombre + " " +  i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void run() {
		arranca2();
	}
	

	public static void main(String[] args) {
		
		CuentaAtrasExtendThreads c3 = new CuentaAtrasExtendThreads(7, "Cuenta Atras 1: ");
		CuentaAtrasExtendThreads c4 = new CuentaAtrasExtendThreads(5, "Cuenta Atras 2: ");
		
//		c1.arranca();
//		c2.arranca();
		
		//El METODO START DE THREAD LO QUE HACE ES LLAMAR AL METODO "RUN" DE RUNNABLE
		//LO ARRANCAMOS EN DOS HILOS DISTINTOS
		c3.start();
		c4.start();

	}

}
