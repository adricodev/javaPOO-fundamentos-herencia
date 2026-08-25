package com.adricodev.genericos.ejercicio07;

public class ElementoUtils {
    public static <T> T obtenerPrimerNoNulo(T[] array) {
        for (T elemento : array) {
            if (elemento != null) {
                return elemento;
            }
        }
        return null;
    }
}

