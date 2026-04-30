public class Usuario {
    private String nombre;
    private int edad;
    private String correo;
    private int telefono;

    /**
     * Ejercicio 2.2: Constructor por defecto (sin parámetros)
     */
    public Usuario() {
        this.nombre = "Desconocido";
        this.edad = 0;
    }

    /**
     * Ejercicio 2.2: Constructor que recibe solo el nombre
     */
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
    }

    /**
     * Ejercicio 2.2: Constructor que recibe nombre y edad
     */
    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Ejercicio 2.2: Sobrecarga de método - Actualizar perfil con correo
     */
    public void actualizarPerfil(String correo) {
        this.correo = correo;
        System.out.println("Perfil actualizado con el correo: " + this.correo);
    }

    /**
     * Ejercicio 2.2: Sobrecarga de método - Actualizar perfil con correo y teléfono
     */
    public void actualizarPerfil(String correo, int telefono) {
        this.correo = correo;
        this.telefono = telefono;
        System.out.println("Perfil actualizado con el correo: " + this.correo + " y teléfono: " + this.telefono);
    }

    // Getters para comprobar los valores si es necesario
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getCorreo() { return correo; }
    public int getTelefono() { return telefono; }
}
