package Ejercicio_Herencia2;

public class CuentaAhorros extends Cuenta{
    private boolean activa;

    public CuentaAhorros(float saldoInicial, float tasaAnual) {
        super(saldoInicial, tasaAnual);
        this.activa = true;
    }

    @Override
    public void consignar(float cantidad) {
        if (activa){
            super.consignar(cantidad);
        } else {
            System.out.println("[ERROR] La cuenta esta inactiva.");
        }
    }

    @Override
    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);
        } else {
            System.out.println("[ERROR] La cuenta esta inactiva.");
        }
    }
    @Override
    public void generarExtractoMensual() {
        super.generarExtractoMensual();
        if (numeroRetiros > 4) {
            comisionMensual += (numeroRetiros - 4) * 1000;
        }
        if (saldo < 10000) {
            System.out.println("Cuenta inactiva");
        } else {
            System.out.println("Cuenta activa");
        }
    }
    public void imprimir() {
        super.imprimir();
        System.out.println("Valor de sobregiro: 0");
    }
}

