package fundamentosHerencia.ejercicio07;

public class PaquetePequeno extends Paquete{
    private double tarifaBase = 5.0;

    public PaquetePequeno(String codigo, double pesoKg, CategoriaEnvio categoria) {
        super(codigo, pesoKg, categoria);

    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    @Override
    public double calcularCosto() {
        return tarifaBase + categoria.getRecargo();
    }

    @Override
    public String toString() {
        return "PaquetePequeno{" +
                "tarifaBase=" + tarifaBase +
                ", codigo='" + codigo + '\'' +
                ", pesoKg=" + pesoKg +
                ", categoria=" + categoria +
                '}';
    }
}


