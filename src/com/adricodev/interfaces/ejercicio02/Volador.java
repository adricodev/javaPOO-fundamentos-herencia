package com.adricodev.interfaces.ejercicio02;

public interface Volador {
    public abstract void volar();

    default void aterrizar() {
        System.out.println("Aterrizandoooo");
    }

    public static String tipo() {
        return "Soy un volador";
    }
}
