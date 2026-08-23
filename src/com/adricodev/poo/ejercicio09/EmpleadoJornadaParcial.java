package com.adricodev.poo.ejercicio09;

public class EmpleadoJornadaParcial extends Empleado{
    private int horasTrabajadas;

    public EmpleadoJornadaParcial(String nombre, double salarioBase, int horasTrabajadas) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * (horasTrabajadas / 40.0);
    }

    @Override
    public String toString() {
        return super.toString() + "\nHoras devengadas mensuales: " + horasTrabajadas;
    }
}
