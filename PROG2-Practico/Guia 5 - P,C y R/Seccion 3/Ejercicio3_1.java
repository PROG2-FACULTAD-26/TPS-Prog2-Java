public class Ejercicio3_1 {
    public static void main(String[] args) throws InterruptedException {
        ContadorSincronizado contador = new ContadorSincronizado();

        Thread hilo1 = new Thread(new TareaIncrementarSincronizada(contador), "Hilo-1");
        Thread hilo2 = new Thread(new TareaIncrementarSincronizada(contador), "Hilo-2");

        System.out.println("Iniciando hilos con método sincronizado...");
        
        hilo1.start();
        hilo2.start();

        hilo1.join();
        hilo2.join();

        System.out.println("Valor final del contador: " + contador.getValor());
        System.out.println("Valor esperado: 20000");
        if (contador.getValor() == 20000) {
            System.out.println("¡El problema de condición de carrera se ha solucionado!");
        } else {
            System.out.println("Sigue habiendo una anomalía.");
        }
    }
}

class ContadorSincronizado {
    private int valor = 0;

    // Sincronización a nivel de método: el hilo actual adquiere el monitor del objeto completo
    public synchronized void incrementar() {
        valor++; 
    }

    public int getValor() {
        return valor;
    }
}

class TareaIncrementarSincronizada implements Runnable {
    private ContadorSincronizado contador;

    public TareaIncrementarSincronizada(ContadorSincronizado contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            contador.incrementar();
        }
    }
}
