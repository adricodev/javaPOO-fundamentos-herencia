package com.adricodev.repositorioCRUD.ejercicio06;

import com.adricodev.repositorioCRUD.ejercicio06.implementacion.LibroInterfaceImpl;
import com.adricodev.repositorioCRUD.ejercicio06.interfaces.LibroInterfaceCrud;
import com.adricodev.repositorioCRUD.ejercicio06.modelo.Libro;

public class Main {
    public static void main(String[] args) {
        LibroInterfaceCrud repo = new LibroInterfaceImpl();

        repo.guardar(new Libro("Miguel de Cervantes", 25.99));
        repo.guardar(new Libro("Gabriel García Marquez", 10.20));
        repo.guardar(new Libro("Miguel de Unamuno", 32.20));
        repo.guardar(new Libro("Carlos Sisi", 20.00));
        repo.guardar(new Libro("Fernando de Rojas", 14.99));

        System.out.println("Búsqueda por autor 'miguel':");
        for (Libro l : repo.porAutor("miguel")) {
            System.out.println(l);
        }

        System.out.println(" ");
        System.out.println("Libros con precio mayor a 15.0:");
        for (Libro l : repo.conPrecioMayor(15.0)) {
            System.out.println(l);
        }

        System.out.println(" ");

        Libro unamuno = repo.porAutor("Unamuno").getFirst();
        unamuno.setPrecio(28.50);
        repo.actualizar(unamuno);
        System.out.println("Actualizado: " + repo.porAutor("unamuno").getFirst());

        System.out.println(" ");

        repo.remover(repo.porAutor("Sisi").getFirst().getId());
        System.out.println("Tras eliminar a Carlos Sisi:");
        for (Libro l : repo.porAutor("")) {
            System.out.println(l);
        }
    }
}
