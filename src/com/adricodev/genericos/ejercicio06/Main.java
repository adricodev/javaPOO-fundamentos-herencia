package com.adricodev.genericos.ejercicio06;

public class Main {
    public static void main(String[] args) {
        String [] nombres = {"Adrián","Niko","Leda"};
        System.out.println(BuscadorUtils.buscarUtils(nombres,"Adrián"));
        System.out.println(BuscadorUtils.buscarUtils(nombres,"Paco"));
    }
}
