package com.adricodev.repositorioCRUD.ejercicio05.implementacion;


import com.adricodev.repositorioCRUD.ejercicio05.interfaces.EmpleadoRepositorioCrud;
import com.adricodev.repositorioCRUD.ejercicio05.modelo.Empleado;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoRepoImpl implements EmpleadoRepositorioCrud {
    private List<Empleado> empleados = new ArrayList<>();
    @Override
    public List<Empleado> listar() {
        return empleados;
    }

    @Override
    public Empleado porId(Integer id) {
        for(Empleado e : empleados){
            if(e.getId().equals(id)){
                return e;
            }
        }
        return null;
    }

    @Override
    public void guardar(Empleado empleado) {
        empleados.add(empleado);

    }

    @Override
    public void actualizar(Empleado empleado) {
        Empleado empleadoGuardado = porId(empleado.getId());
        if(empleadoGuardado != null){
            empleadoGuardado.setDepartamento(empleado.getDepartamento());
            empleadoGuardado.setNombre(empleado.getNombre());
            empleadoGuardado.setSalario(empleado.getSalario());
        }
    }

    @Override
    public void borrar(Integer id) {
        empleados.remove(porId(id));
    }
}
