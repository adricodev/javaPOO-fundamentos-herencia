package com.adricodev.fundamentos.ejercicio05;

public class Lavadora extends Electrodomestico{
    private int capacidadKg;

    public Lavadora(String marca, double consumo) {
        super(marca, consumo);
    }

    public int getCapacidadKg() {
        return capacidadKg;
    }
    //Indicaremos la capacidad a través del setter y no del constructor.
    public void setCapacidadKg(int capacidadKg) {
        this.capacidadKg = capacidadKg;
    }

    @Override
    public String encender() {
        return "Lavadora " + getMarca() + " ha sido encendida";
    }

    public void lavar(){
        System.out.println("Iniciando programa de lavado prenda delicada para " + getCapacidadKg() + "Kg.");
    }
}
