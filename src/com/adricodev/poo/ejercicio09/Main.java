package com.adricodev.poo.ejercicio09;

public class Main {
    public static void main(String[] args) {
        EmpleadoJornadaCompleta empComp1 = new EmpleadoJornadaCompleta("Adrián",1500,600);
        EmpleadoJornadaCompleta empComp2 = new EmpleadoJornadaCompleta("Maria",950.65,500);
        EmpleadoJornadaParcial empPar1 = new EmpleadoJornadaParcial("Juanseto",200.54,15);
        EmpleadoJornadaParcial empPar2 = new EmpleadoJornadaParcial("Eulalia",800.74,31);

        Empleado[] empleados = {empComp1,empComp2,empPar1,empPar2};

        for(Empleado e : empleados){
            System.out.println(e);
            System.out.println(e.calcularSalario());
            System.out.println("********************************");
        }

    }
}
