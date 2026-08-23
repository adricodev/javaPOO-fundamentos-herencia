package com.adricodev.fundamentos.ejercicio03TypeCasting;

public class Main {
    public static void main(String[] args) {
        Perro p1 = new Perro("Niko", "Bodeguero");
        Gato g1 = new Gato("Queen", "Negro");
        Vaca v1 = new Vaca("Vaca que rie", 200.15);
        Perro p2 = new Perro("Leda", "Podenco");

        Animal[] animales = new Animal[4];

        animales[0] = p1;
        animales[1] = g1;
        animales[2] = v1;
        animales[3] = p2;


        for(Animal a : animales){
            if (a instanceof Perro){
                Perro p = (Perro)a;
                p.ladrar();
            }else if(a instanceof Gato){
                Gato g = (Gato) a;
                g.maullar();
            }else if(a instanceof Vaca){
                Vaca v = (Vaca) a;
                v.mugir();
            }else{
                System.out.println("Animal Genérico");
            }
        }
        System.out.println("********* Api Reflexion *********");
        for (Animal a : animales){
            Class clase = a.getClass();
            while(clase != null){
                System.out.println(clase.getSimpleName());
                clase = clase.getSuperclass();
            }
            System.out.println("===========================");
        }
    }
}