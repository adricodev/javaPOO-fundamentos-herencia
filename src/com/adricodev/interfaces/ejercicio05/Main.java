package com.adricodev.interfaces.ejercicio05;

public class Main {
    public static void main(String[] args) {

        Televisor t1 = new Televisor();
        EquipoSonido e1 = new EquipoSonido();


        encenderYUSar(t1);
        encenderYUSar(e1);
    }
    public static void encenderYUSar(Encendible e){
        e.encender();
        if(e instanceof Reproducible){
            Reproducible r = (Reproducible) e;
            r.reproducir();
        }

    }
    public static void apagarDispositivo(Apagable e){
        e.apagar();
    }
    public static void reproducirYEscuchar(Reproducible e){
        e.reproducir();
    }
}
