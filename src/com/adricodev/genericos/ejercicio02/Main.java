package com.adricodev.genericos.ejercicio02;

public class Main {
    public static void main(String[] args) {
        Caja <String> cajaString = new Caja<>();
        Caja <Integer> cajaDeEnteros = new Caja<>();

        cajaString.guardar("Elemento de Strings!!");
        String letras = cajaString.obtener();
        System.out.println(letras);
        boolean hayCadenas = cajaString.estaVacia();
        System.out.println(hayCadenas);
        cajaString.vaciar();
        System.out.println(cajaString.estaVacia());

        cajaDeEnteros.guardar(38);
        Integer enteros = cajaDeEnteros.obtener();
        System.out.println(enteros);
        boolean hayEnteros = cajaDeEnteros.estaVacia();
        System.out.println(hayEnteros);
        cajaDeEnteros.vaciar();
        System.out.println(cajaDeEnteros.estaVacia());
    }
}
