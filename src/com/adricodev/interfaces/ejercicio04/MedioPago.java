package com.adricodev.interfaces.ejercicio04;

public abstract class MedioPago {
    protected double saldo;

    public MedioPago(double saldo) {
        this.saldo = saldo;
    }
    public void consultarSaldo(){
        System.out.println("Saldo actual: " + saldo);
    }
}
