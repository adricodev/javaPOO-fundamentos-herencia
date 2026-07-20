package fundamentosHerencia.ejercicio06;

public abstract class Paquete {
    protected String codigo;
    protected double pesoKg;
    protected CategoriaEnvio categoria;

    public Paquete(String codigo, double pesoKg, CategoriaEnvio categoria) {
        this.codigo = codigo;
        this.pesoKg = pesoKg;
        this.categoria = categoria;
    }

    public abstract double calcularCosto();
}
