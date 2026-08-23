package com.adricodev.repositorioCRUD.ejercicio05.modelo;

public class Empleado {
    private Integer id;
    private String nombre;
    private String departamento;
    private Double salario;
    private static int idContador;

    public Empleado(String nombre, String departamento, Double salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
        this.id = ++idContador;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public Double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Id=" + id +
                " Nombre='" + nombre + '\'' +
                " Departamento='" + departamento + '\'' +
                " Salario=" + salario;
    }
}
