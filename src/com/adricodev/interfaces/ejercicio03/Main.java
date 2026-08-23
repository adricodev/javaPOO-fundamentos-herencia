package com.adricodev.interfaces.ejercicio03;

public class Main {
    public static void main(String[] args) {

        TarjetaCredito tarjeta = new TarjetaCredito(1000);
        Paypal cuentaPaypal = new Paypal(500);
        tarjeta.consultarSaldo();


        tarjeta.pagar(200);
        tarjeta.consultarSaldo();

        tarjeta.pagar(259);
        tarjeta.consultarSaldo();

        tarjeta.pagar(500);
        tarjeta.consultarSaldo();


        tarjeta.pagar(200);
        tarjeta.consultarSaldo();

        System.out.println(" ");

        cuentaPaypal.pagar(400);
        cuentaPaypal.consultarSaldo();


    }
}
