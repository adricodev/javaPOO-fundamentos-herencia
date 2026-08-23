package com.adricodev.interfaces.ejercicio02;

public class Main {
    public static void main(String[] args) {
        Pajaro p1 = new Pajaro();
        Avion v1 = new Avion();

        p1.volar();
        v1.volar();

        System.out.println(Volador.tipo());

        p1.aterrizar();
        v1.aterrizar();
    }
}
