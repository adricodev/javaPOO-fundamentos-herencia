package com.adricodev.interfaces.ejercicio01;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);
        Rectangulo rectangulo = new Rectangulo(5,2.2);

        System.out.println("Área del circulo es de: "+circulo.calcularArea());
        System.out.println("Área del rectangulo es de: "+rectangulo.calcularArea());
    }
}
