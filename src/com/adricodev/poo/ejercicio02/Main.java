package com.adricodev.poo.ejercicio02;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Adrián","76666666F");
        Cliente cliente2 = new Cliente("Miriam", "76644444C");
        CuentaAhorro ahorro1 = new CuentaAhorro("ES24 9999 8888 4444",cliente1,500,2);
        CuentaCorriente corriente1 = new CuentaCorriente("ES54 5878 9898 9632", cliente1,100,200);
        CuentaCorriente corriente2 = new CuentaCorriente("ES54 7845 5548 5454", cliente2,50,10);
        Banco banco1 = new Banco("Banco Santander", new Cuenta[]{ahorro1,corriente1,corriente2});

        corriente1.depositar(5000);
        corriente2.depositar(1000);

        ahorro1.aplicarInteres();

        corriente1.transferir(corriente2,3000);
        corriente1.transferir(ahorro1,4000);


        banco1.mostrarTransferencia(ahorro1,corriente1,1000,true);
    }
}
