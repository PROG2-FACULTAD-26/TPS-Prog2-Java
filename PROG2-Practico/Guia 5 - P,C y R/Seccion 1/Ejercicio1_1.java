public class Ejercicio1_1 {
    public static void main(String[] args) {
        TareaHilo hilo1 = new TareaHilo();
        TareaHilo hilo2 = new TareaHilo();
        TareaHilo hilo3 = new TareaHilo();

        System.out.println("Iniciando hilos concurrentes...");
        
        // Se invoca start() para solicitar a la JVM la ejecución concurrente
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}

class TareaHilo extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Número: " + i);
            try {
                // Pequeña pausa para hacer más evidente la concurrencia
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
