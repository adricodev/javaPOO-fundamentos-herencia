package fundamentosHerencia.ejercicio08;

public abstract class Instrumento {
    protected String nombre;
    protected TipoInstrumento tipo;

    public Instrumento(String nombre, TipoInstrumento tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoInstrumento getTipo() {
        return tipo;
    }

    public abstract String tocar();

    @Override
    public String toString() {
        return "nombre='" + nombre + ", tipo=" + tipo;
    }
}
