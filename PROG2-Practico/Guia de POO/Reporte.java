public class Reporte {

    /**
     * Ejercicio 2.1: Método sin retorno
     */
    public void generarEncabezado() {
        System.out.println("========================================");
        System.out.println("           REPORTE DEL SISTEMA          ");
        System.out.println("========================================");
    }

    /**
     * Ejercicio 2.1: Método con retorno
     * @return El cuerpo del reporte como cadena de texto.
     */
    public String obtenerCuerpo() {
        return "Este es el contenido principal del reporte.\nTodo funciona correctamente.";
    }

    /**
     * Ejercicio 2.3: Método con argumentos variables (var-args)
     * @param secciones Nombres o contenidos de las secciones del reporte.
     */
    public void imprimirSecciones(String... secciones) {
        System.out.println("Imprimiendo secciones del reporte:");
        
        if (secciones.length == 0) {
            System.out.println("No se proporcionaron secciones.");
        } else {
            // Recorriendo las secciones usando un bucle for-each
            int contador = 1;
            for (String seccion : secciones) {
                System.out.println("Sección " + contador + ": " + seccion);
                contador++;
            }
        }
        System.out.println("----------------------------------------");
    }
}
