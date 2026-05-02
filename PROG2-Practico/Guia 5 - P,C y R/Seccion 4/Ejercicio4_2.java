public class Ejercicio4_2 {
    public static void main(String[] args) {
        Thread hiloLargo = new Thread(new TareaLarga(), "Hilo-Secundario-Largo");

        System.out.println("Hilo principal iniciando hilo secundario...");
        hiloLargo.start();

        try {
            // == EXPERIMENTO 1 (Espera con join) ==
            // Descomenta las siguientes dos líneas para probar la espera
            // System.out.println("Hilo principal bloqueado esperando a que termine el hilo secundario con join()...");
            // hiloLargo.join();
            // System.out.println("El hilo secundario terminó. El hilo principal continúa su ejecución.");

            // == EXPERIMENTO 2 (Interrupción con interrupt) ==
            // En este experimento el hilo principal decide no esperar más de 3 segundos
            System.out.println("Hilo principal esperando un rato...");
            Thread.sleep(3000); 
            
            if (hiloLargo.isAlive()) {
                System.out.println("El hilo principal se cansó de esperar. ¡Enviando señal de interrupción al hilo secundario!");
                hiloLargo.interrupt();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Fin de la ejecución del hilo principal.");
    }
}

class TareaLarga implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " ha comenzado una tarea que tardará 10 segundos...");
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " procesando... (" + i + " seg)");
                
                // sleep() pone al hilo en estado bloqueado/espera, donde es vulnerable a InterruptedException
                Thread.sleep(1000); 
            }
            System.out.println(Thread.currentThread().getName() + " ha completado su tarea con normalidad.");
        } catch (InterruptedException e) {
            // Esta excepción se gatilla inmediatamente si el hilo es interrumpido mientras dormía o esperaba
            System.out.println("¡EXCEPCIÓN CAPTURADA! -> " + Thread.currentThread().getName() + " fue interrumpido (abortado) mientras dormía.");
        }
    }
}
