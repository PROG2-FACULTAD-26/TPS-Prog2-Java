import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivo {
    public static void main(String[] args) {

        String ruta = "PROG2-Practico/Guia 4 - Errores/Seccion 4/personas.txt";

        System.out.println("Iniciando lectura del archivo...");

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            int contador = 0;

            while ((linea = br.readLine()) != null) {
                contador++;
                System.out.println("Línea " + contador + ": " + linea);
            }

            System.out.println("\nLectura finalizada con éxito. Total de líneas: " + contador);

        } catch (IOException e) {
            // Manejo de posibles errores de entrada/salida
            System.out.println("No se pudo procesar el archivo.");
            System.out.println("Detalle del error: " + e.getMessage());
        }
    }
}
