package com.adricodev.interfaces.ejercicio05;

public class Televisor implements Encendible, Apagable{

    @Override
    public void apagar() {
        System.out.println("Televisión apagada");
    }

    @Override
    public void encender() {
        System.out.println("Televisión encendida");
    }
}
