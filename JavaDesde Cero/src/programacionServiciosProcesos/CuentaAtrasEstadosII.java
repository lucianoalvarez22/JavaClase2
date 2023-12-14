package programacionServiciosProcesos;

import java.util.ArrayList;
import java.util.List;

public class CuentaAtrasEstadosII implements Runnable {
    private static final long milis = 10;
    private int start;
    private String name;

    public CuentaAtrasEstadosII(String name, int start) {
        this.start = start;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = start; i >= 0; i--) {
            System.out.printf("%s: %d%n", name, i);
            try {
                Thread.sleep(milis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CuentaAtrasEstadosII c1 = new CuentaAtrasEstadosII("C1", 10);
        List<Thread.State> states = new ArrayList<>();
        Thread.State state;
        
        // Estado NEW
        Thread thread = new Thread(c1);
        state = thread.getState();
        states.add(state);
        System.out.println(state);


        // Estado RUNNABLE
        thread.start();
        state = thread.getState();
        states.add(state);
        System.out.println(state);

        
        while (thread.isAlive()) {
            // Agregar el estado actual a la lista    	
            state = thread.getState();
            states.add(state);
            System.out.println(state);
            Thread.sleep(milis / 2);
        }

        // Estado TERMINATED
        states.add(thread.getState());

        // Imprimir todos los estados por los que pasó el hilo
        System.out.println("Estados por los que pasó el hilo:");
        states.forEach(System.out::println);
        System.out.printf("Estados almacenados: %d%n", states.size());    }
}
