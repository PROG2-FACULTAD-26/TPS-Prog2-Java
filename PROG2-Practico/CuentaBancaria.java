public class CuentaBancaria {
    
    // Campos de estado con modificador private para evitar modificaciones directas (Encapsulación)
    private double saldo;
    private String numeroCuenta;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("El saldo inicial no puede ser negativo. Se inicializó en 0.");
        }
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * @return saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Obtiene el número de la cuenta.
     * @return número de cuenta.
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Permite depositar dinero en la cuenta validando que el monto sea positivo.
     * @param monto Cantidad a depositar.
     */
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Se depositaron $" + monto + " exitosamente. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Error: No se pueden depositar montos negativos o nulos.");
        }
    }
}
