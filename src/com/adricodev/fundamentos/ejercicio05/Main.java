package com.adricodev.fundamentos.ejercicio05;

public class Main {
    public static void main(String[] args) {
        Lavadora l1 = new Lavadora("Bosh", 150.9);
        Heladera h1 = new Heladera("Zanussi", 900.10, true);
        Microondas m1 = new Microondas("Philips", 960.90, 900);
        Heladera h2 = new Heladera("Hisense", 89, false);

        l1.setCapacidadKg(15);

        Electrodomestico[] electrodomesticos = {l1, h1, m1, h2};

        for (Electrodomestico e : electrodomesticos) {
            System.out.println(e.encender());
        }

        for (Electrodomestico e : electrodomesticos) {
            if (e instanceof Lavadora) {
                Lavadora l = (Lavadora) e;
                l.lavar();
            } else if (e instanceof Heladera) {
                Heladera h = (Heladera) e;
                if(h.isTieneFreezer()){
                    h.enfriar();
                }else {
                    System.out.println("Heladera "+h.getMarca()+" no tiene freezer.");
                }
            } else if (e instanceof Microondas) {
                Microondas m = (Microondas) e;
                m.calentar();
            }
        }
        System.out.println(" ");
        System.out.println("***********JERARQUIA CLASES**********");
        for (Electrodomestico e : electrodomesticos) {
            Class clase = e.getClass();
            while (clase != null) {
                System.out.println(clase.getSimpleName());
                clase = clase.getSuperclass();
            }
            System.out.println("********************");
        }

    }
}
