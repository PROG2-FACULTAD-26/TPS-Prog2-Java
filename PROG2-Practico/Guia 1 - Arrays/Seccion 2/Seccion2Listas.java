import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Seccion2Listas {

    public static void ejecutar() {
        System.out.println("--- Ejercicio 2.1: Operaciones CRUD en ArrayList ---");
        // Creación de ArrayList de tipo String
        ArrayList<String> ciudades = new ArrayList<>();
        
        // Agregar tres elementos
        ciudades.add("Buenos Aires");
        ciudades.add("Cordoba");
        ciudades.add("Rosario");
        System.out.println("Lista inicial: " + ciudades);
        
        // Actualizar el valor del segundo elemento (índice 1)
        ciudades.set(1, "Mendoza");
        System.out.println("Lista tras set() en segundo elemento: " + ciudades);
        
        // Recuperar el primer valor
        String primeraCiudad = ciudades.get(0);
        System.out.println("Primer valor recuperado con get(0): " + primeraCiudad);
        
        // Eliminar el último elemento
        ciudades.remove(ciudades.size() - 1);
        System.out.println("Lista tras remove() del ultimo elemento: " + ciudades);


        System.out.println("\n--- Ejercicio 2.2: Listas Inmutables vs LinkedList ---");
        // Crear lista inmutable compatible con Java 8 en adelante
        List<String> inmutable = java.util.Collections.unmodifiableList(java.util.Arrays.asList("Rojo", "Verde", "Azul"));
        System.out.println("Lista inmutable creada: " + inmutable);
        
        // Intentar agregar un nuevo elemento (capturando la excepción)
        try {
            inmutable.add("Amarillo");
        } catch (UnsupportedOperationException e) {
            System.out.println("Excepcion capturada al intentar modificar lista inmutable: " + e.getClass().getSimpleName());
        }
        
        // Pasar la lista inmutable al constructor de un LinkedList para crear una lista mutable
        LinkedList<String> mutableList = new LinkedList<>(inmutable);
        System.out.println("LinkedList mutable creada a partir de la inmutable: " + mutableList);
        
        // Realizar inserciones en el medio de la lista (índice 1)
        mutableList.add(1, "Naranja");
        System.out.println("LinkedList tras inserción en el medio: " + mutableList);
    }

    public static void main(String[] args) {
        ejecutar();
    }
}
