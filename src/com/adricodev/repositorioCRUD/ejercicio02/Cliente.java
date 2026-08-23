package com.adricodev.repositorioCRUD.ejercicio02;

public class Cliente {
    private int id;
    private String nombre;
    private String email;
    private static int contadorId;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.id = ++contadorId;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getContadorId() {
        return contadorId;
    }

    @Override
    public String toString() {
        return "Id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'';
    }
}
