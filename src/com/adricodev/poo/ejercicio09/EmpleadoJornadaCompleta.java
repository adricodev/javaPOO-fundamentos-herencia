package com.adricodev.poo.ejercicio09;

public class EmpleadoJornadaCompleta extends Empleado{
    private double bono;

    public EmpleadoJornadaCompleta(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBono acumulado: " + bono;
    }
}
