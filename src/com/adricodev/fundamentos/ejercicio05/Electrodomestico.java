package com.adricodev.fundamentos.ejercicio05;

public abstract class Electrodomestico {
    protected String marca;
    protected double consumo;

    public Electrodomestico(String marca, double consumo) {
        this.marca = marca;
        this.consumo = consumo;
    }

    public String getMarca() {
        return marca;
    }

    public double getConsumo() {
        return consumo;
    }

    public abstract String encender();
}
