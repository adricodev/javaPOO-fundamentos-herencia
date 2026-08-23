package com.adricodev.poo.ejercicio06;

public class PaqueteGrande extends Paquete {
    private double tarifaBase = 20.0;
    private double adicionalFragil = 10.5;
    private boolean cargaFragil;

    public PaqueteGrande(String codigo, double pesoKg, CategoriaEnvio categoria) {
        super(codigo, pesoKg, categoria);

    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public double getAdicionalFragil() {
        return adicionalFragil;
    }

    public boolean isCargaFragil() {
        return cargaFragil;
    }

    public void setCargaFragil(boolean cargaFragil) {
        this.cargaFragil = cargaFragil;
    }

    @Override
    public double calcularCosto() {
        if (cargaFragil) {
            return tarifaBase + adicionalFragil + categoria.getRecargo();
        } else {
            return getTarifaBase() + categoria.getRecargo();
        }
    }

    @Override
    public String toString() {
        return "PaqueteGrande{" +
                "tarifaBase=" + tarifaBase +
                ", adicionalFragil=" + adicionalFragil +
                ", cargaFragil=" + cargaFragil +
                ", codigo='" + codigo + '\'' +
                ", pesoKg=" + pesoKg +
                ", categoria=" + categoria +
                '}';
    }
}
