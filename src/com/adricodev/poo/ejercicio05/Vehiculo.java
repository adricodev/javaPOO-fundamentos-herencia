package com.adricodev.poo.ejercicio05;

public abstract class Vehiculo {
    protected String marca;
    protected int anio;

    public Vehiculo(String marca, int anio) {
        this.marca = marca;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    public abstract String mover();

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", anio=" + anio +
                '}';
    }
}
