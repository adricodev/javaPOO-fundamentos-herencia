package com.adricodev.interfaces.ejercicio01;

public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return radio * Math.PI;
    }
}


