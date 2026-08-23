package com.adricodev.fundamentos.ejercicio05;

public class Heladera extends Electrodomestico{
    private boolean tieneFreezer;

    public Heladera(String marca, double consumo, boolean tieneFreezer) {
        super(marca, consumo);
        this.tieneFreezer = tieneFreezer;
    }

    public boolean isTieneFreezer() {
        return tieneFreezer;
    }

    @Override
    public String encender() {
        return "Heladera "+getMarca()+ " ha sido encendida.";
    }

    public void enfriar(){
        System.out.println("Iniciado enfriado a -10 grados para bebidas fresquitas");
    }
}
