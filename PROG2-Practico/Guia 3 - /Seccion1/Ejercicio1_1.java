package Seccion1;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Ejercicio1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Predicate<Integer> que devuelva true si un numero es par
        Predicate<Integer> esPar = (n) -> n % 2 == 0;
        System.out.println("¿Es 4 par?: " + esPar.test(4));
        System.out.println("¿Es 7 par?: " + esPar.test(7));

        // 2. Function<String, Integer> que tome una cadena de texto y devuelva su longitud
        Function<String, Integer> obtenerLongitud = (s) -> s.length();
        System.out.println("Longitud de 'Hola Mundo': " + obtenerLongitud.apply("Hola Mundo"));

        // 3. Consumer<Integer> que imprima el numero recibido por consola (ahora desde Scanner)
        Consumer<Integer> imprimirNumero = (n) -> System.out.println("Numero recibido e ingresado por consola: " + n);
        
        System.out.print("Ingrese un numero para el Consumer: ");
        int numeroUsuario = scanner.nextInt();
        imprimirNumero.accept(numeroUsuario);

        // 4. Supplier<Double> que devuelva un numero aleatorio usando Math.random()
        Supplier<Double> numeroAleatorio = () -> Math.random();
        System.out.println("Numero aleatorio: " + numeroAleatorio.get());

        scanner.close();
    }
}
