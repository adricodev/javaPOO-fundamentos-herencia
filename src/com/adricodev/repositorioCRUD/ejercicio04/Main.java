package com.adricodev.repositorioCRUD.ejercicio04;


import com.adricodev.repositorioCRUD.ejercicio04.implementacion.LibroRepoImpl;
import com.adricodev.repositorioCRUD.ejercicio04.interfaces.LibroRepositorioCrud;
import com.adricodev.repositorioCRUD.ejercicio04.modelo.Libro;

public class Main {
    public static void main(String[] args) {
        LibroRepositorioCrud repo = new LibroRepoImpl();

        repo.guardar(new Libro("Miguel de Cervantes",25.99));
        repo.guardar(new Libro("Gabriel García Marquez",10.20));
        repo.guardar(new Libro("Miguel de unamuno", 32.20));
        repo.guardar(new Libro("Carlos Sisi",20.00));
        repo.guardar(new Libro("Fernando de Rojas", 14.99));

        repo.guardar(new Libro("Lopes de Bega",8999));
        repo.guardar(new Libro("Tonterias", 30));

        //Listamos todos los libros
        for(Libro l : repo.listar()){
            System.out.println(l);
        }

        System.out.println(repo.porId(6));

        //Actualizado el ID 6 para corregir el nombre y el precio
        Libro l6 = repo.porId(6);
        l6.setPrecio(8.99);
        l6.setAutor("Lopez de vega");
        repo.actualizar(l6);

        //Borramos el id 7
        repo.eliminar(7);

        System.out.println(" ");

        for(Libro l : repo.listar()){
            System.out.println(l);
        }
    }
}
