package fundamentosHerencia.ejercicio07;

public class PaqueteMediano extends Paquete {
    private double tarifaBase = 10.0;
    private double cargoExtra = 5.0;

    public PaqueteMediano(String codigo, double pesoKg, CategoriaEnvio categoria) {
        super(codigo, pesoKg, categoria);
    }

    public double getTairfaBase() {
        return tarifaBase;
    }

    public double getCargoExtra() {
        return cargoExtra;
    }

    @Override
    public double calcularCosto() {
        if (pesoKg > 10) {
            return tarifaBase + cargoExtra + categoria.getRecargo();
        } else {
            return tarifaBase + categoria.getRecargo();
        }
    }

    @Override
    public String toString() {
        return "PaqueteMedinano{" +
                "tairfaBase=" + tarifaBase +
                ", cargoExtra=" + cargoExtra +
                ", codigo='" + codigo + '\'' +
                ", pesoKg=" + pesoKg +
                ", categoria=" + categoria +
                '}';
    }
}
