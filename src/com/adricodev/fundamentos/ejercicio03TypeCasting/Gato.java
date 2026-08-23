package com.adricodev.fundamentos.ejercicio03TypeCasting;

public class Gato extends Animal {
    private String color;

    public Gato(String nombre, String color) {
        super(nombre);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void sonido() {
        System.out.println("El Gato hace Miau MIAU!!");
    }

    public void maullar(){
        System.out.println("El gato: Miau");
    }
}
