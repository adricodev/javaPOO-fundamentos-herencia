package com.adricodev.interfaces.ejercicio05;

public class EquipoSonido implements Apagable,Encendible,Reproducible{
    @Override
    public void apagar() {
        System.out.println("Equipo de sonido apagado");
    }

    @Override
    public void encender() {
        System.out.println("Equipo de sonido encendido");
    }

    @Override
    public void reproducir() {
        System.out.println("Equipo de sonido reproduciendo el disco");
    }
}
