package com.adricodev.repositorioCRUD.ejercicio01;

public class Main {
    public static void main(String[] args) {
        FacturaRepositorio fras = new FacturaRepositorioImpl();
        Factura f1 = new Factura(1,"Suministros electrico",45.50);
        Factura f2 = new Factura(2,"Carburante",35.10);

        fras.guardar(f1);
        fras.guardar(f2);
        fras.guardar(new Factura(3,"Material conservación",96.36));

        System.out.println(fras.listar());

        System.out.println(fras.porId(2));
        System.out.println(fras.porId(1000));

        fras.eliminar(1);

        System.out.println(fras.listar());
    }
}
