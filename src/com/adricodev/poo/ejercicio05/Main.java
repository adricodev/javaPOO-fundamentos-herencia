package com.adricodev.poo.ejercicio05;

public class Main {
    public static void main(String[] args) {
        Bicicleta b1 = new Bicicleta("BMX",2003,8);
        Coche c1 = new Coche ("Hyundai",2012,TipoCombustible.GASOLINA);
        Bicicleta b2 = new Bicicleta("Campera",2006,4);
        Coche c2 = new Coche("Mazda",2015,TipoCombustible.DIESEL);
        Coche c3 = new Coche("Ford",2019,TipoCombustible.HIBRIDO);
        Coche c4 = new Coche("Tesla",2019,TipoCombustible.ELECTRICO);

        Vehiculo[] vehiculos = {b1,c1,b2,c2,c3,c4};

        for(Vehiculo v : vehiculos){
            System.out.println(v);
            System.out.println(v.mover());
            System.out.println("====================================");
        }

        for(Vehiculo v : vehiculos){
            if(v instanceof Bicicleta){
                Bicicleta b = (Bicicleta) v;
                b.sonarTrimbre();
            }else if(v instanceof Coche){
                Coche c = (Coche) v;
                c.abrirMaletero();
            }
        }

        for(Vehiculo v : vehiculos){
            if(v instanceof Bicicleta){
                System.out.println(v.getMarca());
            }
        }

        System.out.println("Reflexión de clases");
        for(Vehiculo v : vehiculos){
            Class clase = v.getClass();
            while(clase != null){
                System.out.println(clase.getSimpleName());
                clase = clase.getSuperclass();
            }
            System.out.println("======================================");
        }
    }
}
