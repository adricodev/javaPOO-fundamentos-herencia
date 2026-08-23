package com.adricodev.repositorioCRUD.ejercicio06.interfaces;


import com.adricodev.repositorioCRUD.ejercicio06.modelo.Libro;

import java.util.ArrayList;
import java.util.List;

public interface LibroInterfaceCrud {

    List<Libro> porAutor(String texto);
    List<Libro> conPrecioMayor(Double minimo);
    void guardar(Libro libro);
    void remover(Integer id);
    void actualizar(Libro libro);

}
