public class Ejercicio4_1 {
    public static void main(String[] args) {
        TareaPrioridad tarea = new TareaPrioridad();

        Thread hiloBajaPrioridad = new Thread(tarea, "Hilo-Baja-Prioridad");
        Thread hiloAltaPrioridad = new Thread(tarea, "Hilo-Alta-Prioridad");

        // Asignamos las prioridades
        // 1 es la mínima prioridad (Thread.MIN_PRIORITY)
        // 10 es la máxima prioridad (Thread.MAX_PRIORITY)
        hiloBajaPrioridad.setPriority(1);
        hiloAltaPrioridad.setPriority(10);

        System.out.println("Iniciando hilos con distintas prioridades...");
        
        // Iniciamos ambos hilos
        hiloBajaPrioridad.start();
        hiloAltaPrioridad.start();
    }
}

class TareaPrioridad implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            // Se utiliza Thread.currentThread() para obtener la identidad del hilo ejecutando esta porción de código
            Thread hiloActual = Thread.currentThread();
            
            System.out.println("Identidad: " + hiloActual.getName() + " | Prioridad: " + hiloActual.getPriority() + " | Iteración: " + i);
            
            // Pausa simulada, opcional pero útil para observar el entrelazado
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
