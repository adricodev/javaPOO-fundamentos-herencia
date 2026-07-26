package fundamentosHerencia.ejercicio09;

public class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalario(){
        return salarioBase;
    }

    @Override
    public String toString() {
        return "nombre= " + nombre
                + "\nSalario Base: "+salarioBase;
    }
}
