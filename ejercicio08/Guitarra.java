package fundamentosHerencia.ejercicio08;

public class Guitarra extends Instrumento{
    private int cuerdas;

    public Guitarra(String nombre, TipoInstrumento tipo, int cuerdas) {
        super(nombre, tipo);
        this.cuerdas = cuerdas;
    }

    public int getCuerdas() {
        return cuerdas;
    }

    @Override
    public String tocar() {
        return "Rasgueando las cuerdas de la guittarrita";
    }

    @Override
    public String toString() {
        return super.toString()
                +"\nCuerdas: " + cuerdas;
    }
}
