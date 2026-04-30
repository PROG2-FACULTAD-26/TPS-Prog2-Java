package Seccion1;

import java.util.function.ToIntFunction;
import java.util.function.IntPredicate;

public class Ejercicio1_3 {
    public static void main(String[] args) {
        // Variante primitiva de Function<String, Integer> -> ToIntFunction<String>
        ToIntFunction<String> obtenerLongitudPrimitiva = (s) -> s.length();
        System.out.println("Longitud (primitiva) de 'Jonathan': " + obtenerLongitudPrimitiva.applyAsInt("Antigravity"));

        // Variante primitiva de Predicate<Integer> -> IntPredicate
        IntPredicate esParPrimitivo = (n) -> n % 2 == 0;
        System.out.println("¿Es 10 par? (primitiva): " + esParPrimitivo.test(10));
        System.out.println("¿Es 11 par? (primitiva): " + esParPrimitivo.test(11));
    }
}
