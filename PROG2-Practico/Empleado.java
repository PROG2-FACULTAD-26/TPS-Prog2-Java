// Implementa la interfaz Comparable para definir el orden natural
public class Empleado implements Comparable<Empleado> {
    private String nombre;
    private int edad;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Empleado{nombre='" + nombre + "', edad=" + edad + "}";
    }

    // Sobrescribe compareTo para ordenar según la edad (orden natural)
    @Override
    public int compareTo(Empleado otroEmpleado) {
        return Integer.compare(this.edad, otroEmpleado.edad);
    }
}
