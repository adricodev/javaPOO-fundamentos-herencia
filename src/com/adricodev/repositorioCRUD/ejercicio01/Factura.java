package com.adricodev.repositorioCRUD.ejercicio01;

public class Factura {
    private int id;
    private String descripcion;
    private double importe;

    public Factura(int id, String descripcion, double importe) {
        this.id = id;
        this.descripcion = descripcion;
        this.importe = importe;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getImporte() {
        return importe;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", importe=" + importe+ '\'';
    }
}
