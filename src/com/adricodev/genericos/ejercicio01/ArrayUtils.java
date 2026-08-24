package com.adricodev.genericos.ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {

    //<T> declara que el método es genérico.
    //List<T> es lo que devuelve el método.

    public static <T> List<T> arrayToList(T[] array){
        List<T> lista = new ArrayList<>();
        for(T elemento : array){
            lista.add(elemento);
        }
        return lista;
    }


}
