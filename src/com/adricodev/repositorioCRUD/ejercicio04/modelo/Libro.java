package com.adricodev.repositorioCRUD.ejercicio04.modelo;

public class Libro {
    private int id;
    private String autor;
    private double precio;
    private static int idContador;

    public Libro(String autor, double precio) {
        this.autor = autor;
        this.precio = precio;
        this.id = ++idContador;
    }

    public int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", autor='" + autor + '\'' +
                ", precio=" + precio;
    }
}
