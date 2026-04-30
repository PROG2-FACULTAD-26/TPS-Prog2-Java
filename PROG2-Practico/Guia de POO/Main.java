public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 1.1 y 1.2: SistemaGestor ---");
        SistemaGestor gestor = new SistemaGestor();
        gestor.imprimirMaxConexiones();
        // Accediendo a la constante directamente desde la clase:
        System.out.println("Constante desde la clase: " + SistemaGestor.MAX_CONEXIONES);

        System.out.println("\n--- Ejercicio 1.3: CuentaBancaria ---");
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 1000.0);
        System.out.println("Saldo inicial: $" + cuenta.getSaldo());
        cuenta.depositar(500.0); // Depósito válido
        cuenta.depositar(-200.0); // Intento de depósito negativo

        System.out.println("\n--- Ejercicio 2.1: Reporte (Métodos) ---");
        Reporte reporte = new Reporte();
        reporte.generarEncabezado(); // Método sin retorno (void)
        String cuerpo = reporte.obtenerCuerpo(); // Método con retorno
        System.out.println(cuerpo);

        System.out.println("\n--- Ejercicio 2.2: Usuario (Sobrecarga) ---");
        Usuario user1 = new Usuario(); // Constructor vacío
        Usuario user2 = new Usuario("Alice"); // Constructor con nombre
        Usuario user3 = new Usuario("Bob", 25); // Constructor con nombre y edad
        
        System.out.println("Usuario 3: " + user3.getNombre() + " - Edad: " + user3.getEdad());
        
        user3.actualizarPerfil("bob@ejemplo.com"); // Sobrecarga 1
        user3.actualizarPerfil("bob.nuevo@ejemplo.com", 12345678); // Sobrecarga 2

        System.out.println("\n--- Ejercicio 2.3: Reporte (Var-args) ---");
        // Llamada pasándole tres cadenas distintas
        reporte.imprimirSecciones("Introducción", "Desarrollo", "Conclusión");
        
        // Llamada sin pasarle ningún argumento
        reporte.imprimirSecciones();
    }
}
