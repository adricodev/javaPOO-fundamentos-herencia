package com.adricodev.genericos.ejercicio06;

import java.util.ArrayList;
import java.util.List;

public class BuscadorUtils{
    public static <T> boolean buscarUtils(T[] array, T elemento){
        for(T elementoBuscado : array){
            elementoBuscado.equals(elemento);
            if(elementoBuscado.equals(elemento)){
                return true;
            }
        }
        return false;
    }
}
