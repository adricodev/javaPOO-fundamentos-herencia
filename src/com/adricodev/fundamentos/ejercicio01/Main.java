package com.adricodev.fundamentos.ejercicio01;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Adrián" , "Pineda Torrejón", "76666666F","Plz de la Hispanidad",1002);
        Empleado e1 = new Empleado("Leda", "Potrenka","555555555C,","Calle Pantomima",1000.00,5);
        Gerente g1 = new Gerente("Niko", "Bodegueiro","988898C","FUENGIROLA",2000,1002,60000);
        Persona p1 = new Persona("Persona", "Genérica","S/n", "S/n");



        // System.out.println(g1);
        g1.setPresupuesto(90000);
       // System.out.println(g1);

        Persona[] personas = {c1,e1,g1,p1};

        for(Persona p : personas){
            System.out.println(p);
        }
    }
}
