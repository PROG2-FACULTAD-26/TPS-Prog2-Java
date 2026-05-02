public class Ejercicio1_2 {
    public static void main(String[] args) {
        // Se crea una sola instancia de la tarea
        TareaRunnable tarea = new TareaRunnable();
        
        // Se crean nuevos objetos Thread pasándoles la tarea como argumento
        Thread hilo1 = new Thread(tarea, "Hilo-A");
        Thread hilo2 = new Thread(tarea, "Hilo-B");
        Thread hilo3 = new Thread(tarea, "Hilo-C");

        System.out.println("Iniciando hilos concurrentes con Runnable...");
        
        // Se llama al método start() para ejecutarlos simultáneamente
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}

class TareaRunnable implements Runnable {
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
