package com.adricodev.genericos.ejercicio01;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String [] arrayString ={"Adri","Niko","Leda","Miri"};

        //Convertimos el array en una list usando nuestro método genérico
        List<String> lista = ArrayUtils.arrayToList(arrayString);
        lista.add("Perico");
        lista.add("Paco");

        System.out.println(lista);
    }
}
