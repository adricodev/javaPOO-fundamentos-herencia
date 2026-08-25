package com.adricodev.genericos.ejercicio08;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] miArray = {10, 20, 40, 5, 6};

        ArrayTransformUtils.intercambiarPosiciones(miArray, 0, 2);

        System.out.println(Arrays.toString(miArray));
    }
}
