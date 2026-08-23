package com.adricodev.poo.ejercicio01;

public class Main {
    public static void main(String[] args) {
        PaquetePequeno pq1 = new PaquetePequeno("1202",5, CategoriaEnvio.ESTANDAR);
        PaquetePequeno pq2 = new PaquetePequeno("5255",2, CategoriaEnvio.INTERNACIONAL);
        PaqueteMediano pm1 = new PaqueteMediano("9963",15, CategoriaEnvio.ESTANDAR);
        PaqueteMediano pm2 = new PaqueteMediano("9879",7, CategoriaEnvio.EXPRESS);
        PaqueteGrande pg1 = new PaqueteGrande("0001",20, CategoriaEnvio.EXPRESS);
        PaqueteGrande pg2 = new PaqueteGrande("0002",50, CategoriaEnvio.INTERNACIONAL);

        pg1.setCargaFragil(true);
        pg2.setCargaFragil(false);

        Paquete[] paquetes ={pq1,pq2,pm1,pm2,pg1,pg2};

        for(Paquete p : paquetes){
            System.out.println(" ");
            System.out.println("Información paquete código: " + p.codigo);
            System.out.println(p.toString());
        }

        for(Paquete p : paquetes){
            System.out.println(" ");
            System.out.println("Tarificación paquete código: " + p.codigo);
            System.out.println(p.categoria);
            System.out.println(p.calcularCosto());
        }

    }
}
