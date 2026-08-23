package com.adricodev.repositorioCRUD.ejercicio02;

public class Main {
    public static void main(String[] args) {
        ClienteRepositorio repoclientes = new ClienteRepoImpl();

        Cliente c1 = new Cliente("Adrián Pineda","adrian@email.com");
        Cliente c2 = new Cliente("Fingido Ficticio", "email@outlook.com");
        Cliente c3 = new Cliente("Josemari Garcia","jose@gmail.com");

        repoclientes.guardar(c1);
        repoclientes.guardar(c2);
        repoclientes.guardar(c3);
        repoclientes.guardar(new Cliente("Maria Antonella", "maria.10@email.com"));
        repoclientes.guardar(new Cliente("Daniela Torrasa","danina@email.com"));

        for(Cliente c : repoclientes.listar()){
            System.out.println(c);
        }

        System.out.println(" ");
        System.out.println("Consultas concretas");
        System.out.println(repoclientes.porId(5));
        System.out.println(repoclientes.porId(3));

        repoclientes.eliminar(5);

        System.out.println(repoclientes.porId(5));
    }
}
