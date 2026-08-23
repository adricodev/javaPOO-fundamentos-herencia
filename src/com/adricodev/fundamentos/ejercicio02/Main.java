package com.adricodev.fundamentos.ejercicio02;

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("Producto genérico",2.99);
        Lacteo l1 = new Lacteo("Yogurt griego",2.65,6,20);
        Fruta f1 = new Fruta("Caja de fresas",5.65,1.00,"Rojas");
        Limpieza li1 = new Limpieza("Limpia Cristales", 2.10,"Dosificador",2);
        NoPerecible n1 = new NoPerecible("Miel",5.55,1,100);

        //Agrupamos todas las clases creadas en un Array
        Producto[] productos = {p1,l1,f1,li1,n1};


        //Recorremos todas las clases creadas y las imprimimos en pantalla
        for(Producto p : productos){
            System.out.println("***********************");
            System.out.println(p);
        }

        //Reflexión de clases. Muestra las jerarquías de cada una de ellas.
        System.out.println("=====JERARQUIA DE CLASES=====");
        for(Producto p : productos){
        Class clase = p.getClass();
        while(clase != null){
            System.out.println(clase.getSimpleName());
            clase = clase.getSuperclass();
        }
            System.out.println("==========");
        }
    }
}

