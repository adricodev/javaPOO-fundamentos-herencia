package com.adricodev.poo.ejercicio03;

public class Piano extends Instrumento{
    private int teclas;

    public Piano(String nombre, TipoInstrumento tipo, int teclas) {
        super(nombre, tipo);
        this.teclas = teclas;
    }

    public int getTeclas() {
        return teclas;
    }

    @Override
    public String tocar() {
        return "Tocando las teclas del piano";
    }

    @Override
    public String toString() {
        return super.toString()
                +"\nTeclas: " + teclas;
    }
}
