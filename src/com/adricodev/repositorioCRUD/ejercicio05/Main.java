package com.adricodev.repositorioCRUD.ejercicio05;

import com.adricodev.repositorioCRUD.ejercicio05.implementacion.EmpleadoRepoImpl;
import com.adricodev.repositorioCRUD.ejercicio05.interfaces.EmpleadoRepositorioCrud;
import com.adricodev.repositorioCRUD.ejercicio05.modelo.Empleado;

public class Main {
    public static void main(String[] args) {
        EmpleadoRepositorioCrud repo = new EmpleadoRepoImpl();

        repo.guardar(new Empleado("Adrián Pineda","Departamento Contable",1500.00));
        repo.guardar(new Empleado("Miriam Roji","Departamento RRHH",200.50));
        repo.guardar(new Empleado("Fingido Ficticio","Departamento Mantenimiento",1181.00));

        for(Empleado e : repo.listar()){
            System.out.println(e);
        }

        Empleado e1 = repo.porId(2);
        e1.setSalario(2000.50);
        repo.actualizar(e1);

        for(Empleado e : repo.listar()){
            System.out.println(e);
        }

        repo.borrar(3);


        for(Empleado e : repo.listar()){
            System.out.println(e);
        }

        System.out.println(repo.porId(999));
    }
}
