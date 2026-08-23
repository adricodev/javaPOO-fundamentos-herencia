package com.adricodev.repositorioCRUD.ejercicio05.interfaces;

import com.adricodev.repositorioCRUD.ejercicio05.modelo.Empleado;

import java.util.List;

public interface EmpleadoRepositorioCrud {
    List<Empleado> listar();
    Empleado porId(Integer id);
    void guardar(Empleado empleado);
    void actualizar(Empleado empleado);
    void borrar (Integer id);
}
