public class Ejercicio3_2 {
    public static void main(String[] args) throws InterruptedException {
        ContadorBloque contador = new ContadorBloque();

        Thread hilo1 = new Thread(new TareaIncrementarBloque(contador), "Hilo-1");
        Thread hilo2 = new Thread(new TareaIncrementarBloque(contador), "Hilo-2");

        System.out.println("Iniciando hilos con bloque sincronizado...");
        
        hilo1.start();
        hilo2.start();

        hilo1.join();
        hilo2.join();

        System.out.println("Valor final del contador: " + contador.getValor());
        System.out.println("Valor esperado: 20000");
        if (contador.getValor() == 20000) {
            System.out.println("¡El problema de condición de carrera se ha solucionado usando un bloque sincronizado!");
        } else {
            System.out.println("Sigue habiendo una anomalía.");
        }
    }
}

class ContadorBloque {
    private int valor = 0;

    public void incrementar() {
        // Bloque sincronizado: envuelve únicamente la sección crítica (la operación sobre la variable compartida)
        // Se utiliza "this" como el objeto monitor sobre el cual se realiza la sincronización
        synchronized (this) {
            valor++; 
        }
    }

    public int getValor() {
        return valor;
    }
}

class TareaIncrementarBloque implements Runnable {
    private ContadorBloque contador;

    public TareaIncrementarBloque(ContadorBloque contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            contador.incrementar();
        }
    }
}
