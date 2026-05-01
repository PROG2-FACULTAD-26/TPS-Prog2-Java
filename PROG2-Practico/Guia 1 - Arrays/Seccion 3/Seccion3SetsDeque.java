import java.util.ArrayDeque;
import java.util.HashSet;

public class Seccion3SetsDeque {

    public static void ejecutar() {
        System.out.println("--- Ejercicio 3.1: Unicidad en Sets ---");
        // Instanciar un HashSet de tipo Integer
        HashSet<Integer> conjuntoNumeros = new HashSet<>();
        
        // Intentar insertar el mismo número tres veces
        conjuntoNumeros.add(50);
        conjuntoNumeros.add(50);
        conjuntoNumeros.add(50);
        
        // Agregar otros elementos para ver el desorden
        conjuntoNumeros.add(10);
        conjuntoNumeros.add(99);
        conjuntoNumeros.add(2);
        
        // Verificar usando size()
        System.out.println("El tamano del conjunto tras intentar insertar 50 tres veces es: " + conjuntoNumeros.size());
        
        // Imprimir el conjunto (sin orden garantizado)
        System.out.println("Contenido del conjunto: " + conjuntoNumeros);
        
        // Comprobar si un número existe usando contains()
        boolean existe = conjuntoNumeros.contains(99);
        System.out.println("El numero 99 existe en el conjunto?: " + existe);
        
        // Eliminar usando remove()
        conjuntoNumeros.remove(10);
        System.out.println("Conjunto tras eliminar el 10: " + conjuntoNumeros);


        System.out.println("\n--- Ejercicio 3.2: Colas de doble extremo con ArrayDeque ---");
        // Crear colección ArrayDeque
        ArrayDeque<String> deque = new ArrayDeque<>();
        
        // Agregar elementos al inicio y al final
        deque.addFirst("Medio");
        deque.addLast("Final");
        deque.addFirst("Inicio");
        
        System.out.println("Estado inicial del ArrayDeque: " + deque);
        
        // Recuperar y eliminar de los extremos
        String primerElemento = deque.removeFirst();
        String ultimoElemento = deque.removeLast();
        
        System.out.println("Elemento removido del inicio: " + primerElemento);
        System.out.println("Elemento removido del final: " + ultimoElemento);
        System.out.println("Estado final del ArrayDeque: " + deque);
    }

    public static void main(String[] args) {
        ejecutar();
    }
}
