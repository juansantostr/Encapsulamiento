class CuentaBancaria {
    // Atributo privado
    private double saldo;

    // Constructor por defecto
    public CuentaBancaria() {
        this.saldo = 0.0;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }


    public void retirar(double monto) {
        if (monto > 0) {
            if (monto <= saldo) {
                saldo -= monto;
            } else {
                System.out.println("Fondos insuficientes.");
            }
        } else {
            System.out.println("El monto a retirar debe ser positivo.");
        }
    }


    public double getSaldo() {
        return saldo;
    }
}

// Clase principal con main
public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.depositar(500);
        cuenta.retirar(200);
        System.out.println("Saldo: " + cuenta.getSaldo()); // debe imprimir 300
    }
}
