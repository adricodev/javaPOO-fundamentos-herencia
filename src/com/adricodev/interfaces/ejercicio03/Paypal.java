package com.adricodev.interfaces.ejercicio03;

public class Paypal extends MedioPago implements Pagable{
    public Paypal(double saldo) {
        super(saldo);
    }

    @Override
    public void pagar(double monto) {
        this.saldo = saldo - monto;
        System.out.println("Pagando con Paypal: "+monto+" $");
    }
    //Usando directamente de clase padre.
    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
    }
}
