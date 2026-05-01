import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Seccion5Ordenamiento {

    public static void ejecutar() {
        System.out.println("--- Ejercicio 5.1: Orden natural con Comparable (por Edad) ---");
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Roberto", 45));
        empleados.add(new Empleado("Alicia", 28));
        empleados.add(new Empleado("Ximena", 35));
        empleados.add(new Empleado("Carlos", 22));

        System.out.println("Lista original desordenada:");
        for (Empleado e : empleados) {
            System.out.println("  " + e);
        }

        // Usa Collections.sort para ordenar usando el orden natural (compareTo en Empleado)
        Collections.sort(empleados);
        
        System.out.println("\nLista ordenada por EDAD (Orden Natural):");
        for (Empleado e : empleados) {
            System.out.println("  " + e);
        }

        System.out.println("\n--- Ejercicio 5.2: Orden personalizado con Comparator (por Nombre) ---");
        // Pasar la lista y la nueva instancia del comparador al método Collections.sort
        Collections.sort(empleados, new EmpleadoNombreComparator());
        
        System.out.println("Lista ordenada por NOMBRE (Orden Personalizado):");
        for (Empleado e : empleados) {
            System.out.println("  " + e);
        }
    }

    public static void main(String[] args) {
        ejecutar();
    }
}
