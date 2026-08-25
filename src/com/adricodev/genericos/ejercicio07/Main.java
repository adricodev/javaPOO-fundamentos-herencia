package com.adricodev.genericos.ejercicio07;

public class Main {
    public static void main(String[] args) {
        String [] cadenas = {"Sí","No","Quizás","Puede"};

        System.out.println(ElementoUtils.obtenerPrimerNoNulo(cadenas));

        String [] cadenas2 = {null,"No","Quizás","Puede"};
        System.out.println(ElementoUtils.obtenerPrimerNoNulo(cadenas2));

        String [] cadenas3 = {null,null,null,"Puede"};
        System.out.println(ElementoUtils.obtenerPrimerNoNulo(cadenas3));
    }
}
