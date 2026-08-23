package com.adricodev.fundamentos.ejercicio02;

public class NoPerecible extends Producto{
    private int contenido;
    private int calorias;

    public NoPerecible(String nombre, double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    public String toString(){
        return super.toString()
                +"\nContenido: " + contenido
                +"\nCalorias: " + calorias;
    }
}
