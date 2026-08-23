package com.adricodev.poo.ejercicio03;

public class Bateria extends Instrumento{
    private int tambores;


    public Bateria(String nombre, TipoInstrumento tipo, int tambores) {
        super(nombre, tipo);
        this.tambores = tambores;
    }

    public int getTambores() {
        return tambores;
    }

    @Override
    public String tocar() {
        return "Pum Pum pim pam pum";
    }

    @Override
    public String toString() {
        return super.toString()
                +"\nTambores: " + tambores;
    }
}
