/**
 * La clase SistemaGestor es la encargada de manejar la configuración inicial 
 * y los recursos principales del sistema.
 * Sirve como punto de entrada para inicializar servicios.
 */
public class SistemaGestor {

    // Variable que indica si el sistema está activo o no
    boolean sistemaActivo = false;

    /*
     * Bloque de configuración:
     * Aquí se definen parámetros fundamentales como la URL de la base de datos,
     * credenciales por defecto, y tiempos de espera para las conexiones.
     */
    String urlBaseDatos = "jdbc:mysql://localhost:3306/db";

    /**
     * Ejercicio 1.2:
     * Campo constante usando static y final.
     * Pertenece a la clase en sí (static) porque representa una configuración global
     * compartida por todas las instancias de SistemaGestor, no depende de un objeto específico.
     * Su valor no puede ser reasignado (final) para evitar que se modifique accidentalmente 
     * durante la ejecución, asegurando integridad en el límite de conexiones.
     */
    public static final int MAX_CONEXIONES = 10;

    /**
     * Método que imprime el valor de la constante MAX_CONEXIONES.
     */
    public void imprimirMaxConexiones() {
        System.out.println("El número máximo de conexiones permitidas es: " + MAX_CONEXIONES);
    }
}
