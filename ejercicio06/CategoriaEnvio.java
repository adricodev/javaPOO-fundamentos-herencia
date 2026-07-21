package fundamentosHerencia.ejercicio07;

public enum CategoriaEnvio {
    ESTANDAR(0.0),
    EXPRESS(5.5),
    INTERNACIONAL(15.0);

    private final double recargo;

    CategoriaEnvio(double recargo) {
        this.recargo = recargo;
    }

    public double getRecargo() {
        return recargo;
    }

}
