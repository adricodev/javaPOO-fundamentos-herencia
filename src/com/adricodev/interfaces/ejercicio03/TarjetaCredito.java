package com.adricodev.interfaces.ejercicio03;

public class TarjetaCredito extends MedioPago implements Pagable{
    public TarjetaCredito(double saldo) {
        super(saldo);
    }

    @Override
    public void pagar(double monto) {
        this.saldo = saldo-monto;
        System.out.println("Pagando con tarjeta de crédito: "+monto+" $");
    }
    //Mensaje personalizado.
    @Override
    public void consultarSaldo() {
        System.out.println("Saldo actual de su tarjeta de crédito: " +this.saldo);

    }
}
