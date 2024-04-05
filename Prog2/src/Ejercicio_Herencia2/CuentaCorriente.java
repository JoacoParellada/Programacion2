package Ejercicio_Herencia2;

public class CuentaCorriente extends Cuenta {
    private float sobregiro;

    public CuentaCorriente(float saldoInicial, float tasaAnual) {
        super(saldoInicial, tasaAnual);
        this.sobregiro = 0;
    }

    @Override
    public void retirar(float cantidad) {
        saldo -= cantidad;
        numeroRetiros++;
        if (saldo < 0) {
            sobregiro += Math.abs(saldo);
            saldo = 0;
        }
    }

    @Override
    public void consignar(float cantidad) {
        super.consignar(cantidad);
        if (sobregiro > 0) {
            if (cantidad >= sobregiro) {
                sobregiro = 0;
            } else {
                sobregiro -= cantidad;
            }
        }
    }

    @Override
    public void generarExtractoMensual() {
        super.generarExtractoMensual();
        System.out.println("Sobregiro: " + sobregiro);
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Valor de sobregiro: " + sobregiro);
    }
}
