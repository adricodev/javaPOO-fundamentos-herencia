package com.adricodev.fundamentos.ejercicio03TypeCasting;

public class Vaca extends Animal{
    private double peso;

    public Vaca(String nombre, double peso) {
        super(nombre);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public void sonido() {
        System.out.println("La vaca hace MUUUUUUUUU");
    }

    public void mugir(){
        System.out.println("Vaca: Mu Mu");
    }
}
