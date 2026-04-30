import java.util.Arrays;

public class Seccion1Arrays {

    public static void ejecutar() {
        System.out.println("--- Ejercicio 1.1: Creacion, actualizacion y recuperacion ---");
        // Creación del arreglo de 5 elementos usando 'new'
        int[] numeros = new int[5];
        
        // Asignación de valores a cada posición
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        
        System.out.println("Arreglo inicial: " + Arrays.toString(numeros));
        
        // Actualización del tercer elemento 
        numeros[2] = 35;
        System.out.println("Tercer elemento actualizado a: " + numeros[2]);
        
        // Recuperación del último elemento usando 'length'
        int ultimoElemento = numeros[numeros.length - 1];
        System.out.println("Ultimo elemento recuperado: " + ultimoElemento);


        System.out.println("\n--- Ejercicio 1.2: Ordenamiento y Busqueda ---");
        // Arreglo de tipo String con nombres desordenados
        String[] nombres = {"Zoe", "Carlos", "Ana", "Pedro", "Beatriz"};
        System.out.println("Arreglo desordenado: " + Arrays.toString(nombres));
        
        // Ordenamiento con Arrays.sort()
        Arrays.sort(nombres);
        System.out.println("Arreglo ordenado: " + Arrays.toString(nombres));
        
        // Búsqueda con Arrays.binarySearch()
        String nombreBuscado = "Carlos";
        int posicion = Arrays.binarySearch(nombres, nombreBuscado);
        System.out.println("El nombre '" + nombreBuscado + "' se encuentra en el indice: " + posicion);
    }
}
