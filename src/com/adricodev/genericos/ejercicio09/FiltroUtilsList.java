package com.adricodev.genericos.ejercicio09;

import java.util.ArrayList;
import java.util.List;

public class FiltroUtilsList {
    public static <T> List<T> filtroUtils(List<T> listaOriginal){
        List<T> listaFiltrada = new ArrayList<>();
        for(T lista : listaOriginal){
            if(lista != null){
                listaFiltrada.add(lista);
            }
        }
        return listaFiltrada;
    }
}
