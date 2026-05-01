public class ValidacionUsuario {
    public static void main(String[] args) {
        System.out.println("--- Registro de Usuario ---");
        try {
            registrarUsuario("Jona", -5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error de validación: " + e.getMessage());
        }

        try {
            registrarUsuario("Ana", 20);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void registrarUsuario(String nombre, int edad) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío o ser nulo.");
        }
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        System.out.println("Usuario registrado exitosamente: " + nombre + " (" + edad + " años)");
    }
}
