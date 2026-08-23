package com.adricodev.fundamentos.ejercicio04StringBuilder;

public abstract class Reporte {
    protected String titulo;

    public Reporte(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract String generarContenido();

    public void imprimir(){
        StringBuilder sb = new StringBuilder();
        sb.append(titulo)
                .append("\n")
                .append("===========================")
                .append("\n")
                .append(generarContenido())
                .append("\n")
                .append("===========================");
        System.out.println(sb.toString());
    }
}


