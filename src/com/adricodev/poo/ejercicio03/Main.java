package com.adricodev.poo.ejercicio03;

public class Main {
    public static void main(String[] args) {
        Guitarra g1 = new Guitarra("Electrica",TipoInstrumento.CUERDA,5);
        Piano p1 = new Piano("Organo de tubos",TipoInstrumento.VIENTO,24);
        Bateria b1 = new Bateria("Bateria Electrónica",TipoInstrumento.PERCUSION,5);

        Instrumento[] instrumentos ={g1,p1,b1};

        for(Instrumento i : instrumentos){
            System.out.println(i);
            System.out.println(i.tocar());
            System.out.println("---------------------------");
        }
    }
}
