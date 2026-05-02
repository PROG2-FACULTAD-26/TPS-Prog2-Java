package Seccion1;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Ejercicio1_2 {
    public static void main(String[] args) {
        List<String> textos = new ArrayList<>();
        textos.add("Hola Mundo");
        textos.add("Crear strings");
        textos.add("Programación Orientada a Objetos");
        textos.add("Programacion con Java");
        textos.add("Ordenar segun longitud");

        System.out.println("Lista original: " + textos);

        // Ordenar según su longitud usando una expresión lambda
        textos.sort((a, b) -> a.length() - b.length());

        System.out.println("Lista ordenada por longitud: " + textos);
    }
}
