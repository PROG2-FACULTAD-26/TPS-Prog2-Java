public class FailFast {
    public static void main(String[] args) {
        System.out.println("--- Prueba Fail-fast ---");
        try {
            registrarUsuario("", 25);
        } catch (IllegalArgumentException e) {
            System.out.println("Error capturado: Nombre inválido.");
        }

        try {
            registrarUsuario("Juan", -1);
        } catch (IllegalArgumentException e) {
            System.out.println("Error capturado: Edad inválida.");
        }
    }

    public static void registrarUsuario(String nombre, int edad) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException();
        }
        if (edad < 0) {
            throw new IllegalArgumentException();
        }
        System.out.println("Usuario registrado: " + nombre);
    }
}
