package com.adricodev.repositorioCRUD.ejercicio06.modelo;

public class Libro {
    private Integer id;
    private String autor;
    private Double precio;
    private static int idContador;

    public Libro(String autor, Double precio) {
        this.autor = autor;
        this.precio = precio;
        this.id = ++idContador;
    }

    public Integer getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", autor='" + autor + '\'' +
                ", precio=" + precio;
    }
}
