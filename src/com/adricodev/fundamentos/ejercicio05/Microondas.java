package com.adricodev.fundamentos.ejercicio05;

public class Microondas extends Electrodomestico{
    private int potenciaMaxima;

    public Microondas(String marca, double consumo, int potenciaMaxima) {
        super(marca, consumo);
        this.potenciaMaxima = potenciaMaxima;
    }

    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    @Override
    public String encender() {
        return "Microondas "+getMarca()+" encendido.";
    }

    public void calentar(){
        System.out.println("Calentando a 900w de potencia.");
    }
}
