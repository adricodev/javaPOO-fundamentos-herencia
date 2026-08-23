package com.adricodev.interfaces.ejercicio04;

public class Main {
    public static void main(String[] args) {
        TarjetaCredito t1 = new TarjetaCredito(5000);
        Paypal pp1 = new Paypal(600);

        procesarPago(t1,500);
        procesarPago(pp1,200);


    }
    public static void procesarPago(Pagable medio, double monto){
        medio.pagar(monto);
        ((MedioPago)medio).consultarSaldo();
    }

}

