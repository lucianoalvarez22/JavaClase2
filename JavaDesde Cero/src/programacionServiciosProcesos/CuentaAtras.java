package programacionServiciosProcesos;

public class CuentaAtras implements Runnable {
	
	int valorInicial;
	String nombre;
	
	

	public CuentaAtras(int valorInicial, String nombre) {
		this.valorInicial = valorInicial;
		this.nombre = nombre;
	}
	
	public void arranca() {

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


	@Override
	public void run() {
		arranca();
	}

	public static void main(String[] args) {
		
		CuentaAtras c1 = new CuentaAtras(7, "Cuenta Atras 1: ");
		CuentaAtras c2 = new CuentaAtras(5, "Cuenta Atras 2: ");
		
//		c1.arranca();
//		c2.arranca();
		
		//El METODO START DE THREAD LO QUE HACE ES LLAMAR AL METODO "RUN" DE RUNNABLE
		//LO ARRANCAMOS EN DOS HILOS DISTINTOS
		new Thread(c1).start();;
		new Thread(c2).start();;

	}


}
