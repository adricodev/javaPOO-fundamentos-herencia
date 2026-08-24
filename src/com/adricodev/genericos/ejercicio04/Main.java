package com.adricodev.genericos.ejercicio04;

public class Main {
    public static void main(String[] args) {
        ContenedorSimple<Double> contenedorDecimales = new ContenedorSimple<>();
        contenedorDecimales.setDato(8.5);
        System.out.println(contenedorDecimales.getDato());
        System.out.println(contenedorDecimales.tieneDato());
    }
}
