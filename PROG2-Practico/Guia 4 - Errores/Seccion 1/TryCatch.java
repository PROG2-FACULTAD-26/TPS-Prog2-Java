public class TryCatch {
    public static void main(String[] args) {
        try {
            // Intento de convertir una cadena no numérica a entero
            Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            // Captura de la excepción y muestra de información útil
            System.out.println("Mensaje del error: " + e.getMessage());
            System.out.println("Tipo de clase de excepción: " + e.getClass().getName());
        }
    }
}
