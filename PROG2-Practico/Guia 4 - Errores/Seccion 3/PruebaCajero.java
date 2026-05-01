/**
 * Excepción personalizada de tipo Checked.
 * Obliga al programador a manejarla o declararla.
 */
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}

class CuentaBancaria {
    private double saldo = 1000.0;

    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException("No tienes fondos suficientes. Saldo disponible: $" + saldo);
        }
        saldo -= monto;
        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
    }
}

public class PruebaCajero {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        
        try {
            System.out.println("Intentando retirar $1500...");
            cuenta.retirar(1500.0);
        } catch (SaldoInsuficienteException e) {
            // Manejo obligatorio por ser una excepción Checked
            System.out.println("Error capturado: " + e.getMessage());
        }
    }
}
