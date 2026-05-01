import java.util.Scanner;

public class UsoMultiCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor para dividir 100 por él: ");
        String entrada = scanner.nextLine();

        try {
            // Conversión y cálculo en un mismo bloque
            int numero = Integer.parseInt(entrada);
            int resultado = 100 / numero;
            System.out.println("El resultado de 100 / " + numero + " es: " + resultado);
        } catch (NumberFormatException | ArithmeticException e) {
            // Captura múltiple de excepciones relacionadas
            System.out.println("Error de cálculo o conversión");
        } finally {
            scanner.close();
        }
    }
}
