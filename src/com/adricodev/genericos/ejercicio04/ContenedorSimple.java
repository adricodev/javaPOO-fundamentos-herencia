package com.adricodev.genericos.ejercicio04;

public class ContenedorSimple <T>{
    private T dato;

    public ContenedorSimple() {
    }

    public ContenedorSimple(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public boolean tieneDato(){
       return dato != null;
    }
}
