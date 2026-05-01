
class ProductoInvalidoException extends RuntimeException {
    public ProductoInvalidoException(String mensaje) {
        super(mensaje);
    }
}

class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        if (precio <= 0) {
            // Se lanza una excepción Unchecked
            throw new ProductoInvalidoException("El precio del producto debe ser mayor a cero.");
        }
        this.nombre = nombre;
        this.precio = precio;
        System.out.println("Producto creado: " + nombre + " ($" + precio + ")");
    }
}

public class PruebaProducto {
    public static void main(String[] args) {
        System.out.println("Intentando crear producto con precio negativo...");

        // No envolvemos en try/catch para demostrar que el programa falla (Unchecked)
        Producto p = new Producto("Monitor Gamer", -250.0);

        System.out.println("Este mensaje no se imprimirá si ocurre la excepción.");
    }
}
