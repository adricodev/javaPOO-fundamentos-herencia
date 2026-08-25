package com.adricodev.genericos.ejercicio08;

public class ArrayTransformUtils {
    public static <T> void intercambiarPosiciones(T[] array, int pos1, int pos2){
        T temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] =  temp;


    }


}
