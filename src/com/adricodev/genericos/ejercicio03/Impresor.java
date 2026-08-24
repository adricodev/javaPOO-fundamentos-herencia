package com.adricodev.genericos.ejercicio03;

public class Impresor {

public static <T> void imprimirElemento(T elemento){
    System.out.println("Elemento: " + elemento);
}

};
