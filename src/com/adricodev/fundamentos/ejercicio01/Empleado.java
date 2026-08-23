package com.adricodev.fundamentos.ejercicio01;

public class Empleado extends Persona{
    public double remuneracion;
    private int empleadold;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadold) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadold = empleadold;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadold() {
        return empleadold;
    }

    public double aumentarRemuneracion(double porcentaje){
        return this.remuneracion += this.remuneracion * (porcentaje/100);
    }

    @Override
    public String toString() {
        return super.toString() + "\nRemuneracion: " + getRemuneracion()
                +"\nAntiguedad: " + getEmpleadold();
    }
}
