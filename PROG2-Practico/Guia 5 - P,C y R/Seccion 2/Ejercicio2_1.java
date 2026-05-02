public class Ejercicio2_1 {
    public static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador();

        // Creamos dos hilos que comparten la misma instancia de contador
        Thread hilo1 = new Thread(new TareaIncrementar(contador), "Hilo-1");
        Thread hilo2 = new Thread(new TareaIncrementar(contador), "Hilo-2");

        System.out.println("Iniciando hilos para incrementar el contador...");
        System.out.println("Cada hilo incrementará el contador 10000 veces.");
        
        hilo1.start();
        hilo2.start();

        // Esperamos a que ambos hilos terminen para poder imprimir el resultado final
        hilo1.join();
        hilo2.join();

        // Mostramos el resultado final
        // Se espera que sea 20000, pero debido a la condición de carrera probablemente será menor
        System.out.println("Valor final del contador: " + contador.getValor());
        System.out.println("Valor esperado: 20000");
        if (contador.getValor() != 20000) {
            System.out.println("¡Se ha detectado una anomalía (condición de carrera)!");
        }
    }
}

class Contador {
    private int valor = 0;

    public void incrementar() {
        // Esta operación no es atómica: implica leer, incrementar y guardar.
        // Aquí ocurre la condición de carrera (sección crítica).
        valor++; 
    }

    public int getValor() {
        return valor;
    }
}

class TareaIncrementar implements Runnable {
    private Contador contador;

    public TareaIncrementar(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            contador.incrementar();
        }
    }
}
