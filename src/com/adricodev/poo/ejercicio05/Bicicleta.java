package com.adricodev.poo.ejercicio05;

public class Bicicleta extends Vehiculo{
    private int velocidades;

    public Bicicleta(String marca, int anio, int velocidades) {
        super(marca, anio);
        this.velocidades = velocidades;
    }

    public int getVelocidades() {
        return velocidades;
    }

    public void sonarTrimbre(){
        System.out.println("Ring Ring bicicleta "+marca+" va !!");
    }

    @Override
    public String mover() {
        return "Bicicleta está moviendose con tracción mecánica con pedales";
    }

    @Override
    public String toString() {
        return super.toString()
                +"Velocidades disponibles: " + velocidades;
    }
}
