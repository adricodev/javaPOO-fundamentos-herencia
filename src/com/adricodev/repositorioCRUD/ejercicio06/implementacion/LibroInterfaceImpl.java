package com.adricodev.repositorioCRUD.ejercicio06.implementacion;

import com.adricodev.repositorioCRUD.ejercicio06.interfaces.LibroInterfaceCrud;
import com.adricodev.repositorioCRUD.ejercicio06.modelo.Libro;

import java.util.ArrayList;
import java.util.List;

public class LibroInterfaceImpl implements LibroInterfaceCrud {
    private List<Libro> libros = new ArrayList<>();

    @Override
    public List<Libro> porAutor(String texto) {
        List<Libro> coincidencias = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().toLowerCase().contains(texto.toLowerCase())) {
                coincidencias.add(libro);
            }
        }
        return coincidencias;
    }

    @Override
    public List<Libro> conPrecioMayor(Double minimo) {
        List<Libro> coincidencias = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getPrecio() > minimo) {
                coincidencias.add(libro);
            }
        }
        return coincidencias;
    }

    @Override
    public void guardar(Libro libro) {
        libros.add(libro);
    }

    @Override
    public void remover(Integer id) {
        libros.removeIf(libro -> libro.getId().equals(id));
    }

    @Override
    public void actualizar(Libro libro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId().equals(libro.getId())) {
                libros.set(i, libro);
            }
        }
    }
}
