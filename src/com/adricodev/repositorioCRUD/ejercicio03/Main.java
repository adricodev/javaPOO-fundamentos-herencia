package com.adricodev.repositorioCRUD.ejercicio03;

public class Main {
    public static void main(String[] args) {
        ProductoRepositorio repoProductos = new ProductoRepoImpl();

        Producto p1 = new Producto("Raton",12.32,5);
        Producto p2 = new Producto("Teclado",65.99,10);

        repoProductos.guardar(p1);
        repoProductos.guardar(p2);

        repoProductos.guardar(new Producto("Monitor gaming",654.77,30));
        repoProductos.guardar(new Producto("Alfonvrida Korsair",600.33,5));

        for(Producto p : repoProductos.listar()){
            System.out.println(p);
        }

        System.out.println(" ");
        System.out.println("Consulta por ID");
        System.out.println(repoProductos.porId(4));
        System.out.println("Error en el nombre");
        Producto p4 = repoProductos.porId(4);
        p4.setNombre("Alfombrilla Corsair");
        repoProductos.actualizar(p4);

        System.out.println(repoProductos.porId(4));




    }
}
