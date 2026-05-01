public class PruebaFinally {
    public static void main(String[] args) {
        System.out.println("Iniciando prueba de división...");
        simularDivisionPorCero();
        System.out.println("Prueba finalizada.");
    }

    public static void simularDivisionPorCero() {
        try {
            // Simulación de división por cero
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Se capturó una excepción: " + e.getMessage());
        } finally {
            // Este bloque se ejecuta siempre
            System.out.println("Mensaje final");
        }
    }
}
