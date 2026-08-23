package com.adricodev.poo.ejercicio07;

public class CuentaAhorro extends Cuenta{
    private double tasaInteres;

    public CuentaAhorro(String iban, Cliente titular, double saldo, double tasaInteres) {
        super(iban, titular, saldo);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void aplicarInteres(){
        saldo = saldo + (saldo * (tasaInteres/100));
        System.out.println("Interés aplicado: " + tasaInteres + "%");
        System.out.println("Total saldo: "+saldo);
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "tasaInteres=" + tasaInteres +
                ", iban='" + iban + '\'' +
                ", titular=" + titular +
                ", saldo=" + saldo +
                '}';
    }
}
