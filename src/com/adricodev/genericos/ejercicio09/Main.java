package com.adricodev.genericos.ejercicio09;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("Java");
        listaCadenas.add(null);
        listaCadenas.add("Spring");
        listaCadenas.add(null);

        List<String> listaNueva = FiltroUtilsList.filtroUtils(listaCadenas);

        System.out.println(listaNueva);
    }
}
