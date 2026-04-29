import java.util.Comparator;

// Clase separada que implementa Comparator para la clase Empleado
public class EmpleadoNombreComparator implements Comparator<Empleado> {
    
    // Define lógica para ordenar a los empleados alfabéticamente por su nombre
    @Override
    public int compare(Empleado e1, Empleado e2) {
        return e1.getNombre().compareTo(e2.getNombre());
    }
}
