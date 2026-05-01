import java.util.HashMap;
import java.util.TreeMap;

public class Seccion4Mapas {

    public static void ejecutar() {
        System.out.println("--- Ejercicio 4.1: Manejo de HashMap ---");
        // HashMap que asocia identificadores (Integer) con nombres (String)
        HashMap<Integer, String> usuarios = new HashMap<>();
        
        // Agregar nuevas entradas
        usuarios.put(101, "Juan");
        usuarios.put(102, "Maria");
        usuarios.put(103, "Pedro");
        System.out.println("HashMap inicial: " + usuarios);
        
        // Recuperar un nombre pasando su identificador
        String nombre = usuarios.get(102);
        System.out.println("Usuario con ID 102: " + nombre);
        
        // Actualizar un nombre existente con replace()
        usuarios.replace(103, "Pedro Garcia");
        System.out.println("HashMap tras actualizar el ID 103: " + usuarios);
        
        // Eliminar un registro usando remove()
        usuarios.remove(101);
        System.out.println("HashMap tras eliminar el ID 101: " + usuarios);


        System.out.println("\n--- Ejercicio 4.2: Ordenamiento con TreeMap ---");
        // Instanciar un TreeMap (que ordena por orden natural de la clave)
        TreeMap<Integer, String> usuariosOrdenados = new TreeMap<>();
        
        // Agregar entradas en un orden desordenado respecto a las claves
        usuariosOrdenados.put(50, "Laura");
        usuariosOrdenados.put(10, "Carlos");
        usuariosOrdenados.put(30, "Sofia");
        usuariosOrdenados.put(20, "Miguel");
        
        System.out.println("Recorriendo el TreeMap usando keySet():");
        // Obtener todas las claves y recorrerlas para observar el orden automático
        for (Integer id : usuariosOrdenados.keySet()) {
            System.out.println("ID: " + id + " - Nombre: " + usuariosOrdenados.get(id));
        }
    }

    public static void main(String[] args) {
        ejecutar();
    }
}
