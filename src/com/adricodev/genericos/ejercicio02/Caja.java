package com.adricodev.genericos.ejercicio02;

public class Caja<T>{
    private T contenido;

    public void guardar(T contenido){
        this.contenido = contenido;
    }

    public T obtener(){
        return contenido;
    }

    /* Forma 1 de evaluar el contenido
    public boolean estaVacia(){
        if(contenido != null){
            return false;
        }else{
            return true;
        }
    }
     */

    //segunda forma de comprobarlo. Más sencilla. ¿Es contenido = a null? (siempre devuelve boolean).
    public boolean estaVacia(){
        return contenido == null;
    }

    public void vaciar(){
        this.contenido = null;
    }

}
