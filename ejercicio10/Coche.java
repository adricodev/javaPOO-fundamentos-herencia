package fundamentosHerencia.ejercicio10;

public class Coche extends Vehiculo{
    TipoCombustible tipoCombustible;

    public Coche(String marca, int anio, TipoCombustible tipoCombustible) {
        super(marca, anio);
        this.tipoCombustible = tipoCombustible;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void abrirMaletero(){
        System.out.println("Maletero trasero del coche " + marca + " se ha abierto");
    }

    @Override
    public String mover() {
        return "Coche " + marca + " moviéndose";
    }

    @Override
    public String toString() {
        return super.toString()
                +"Tipo de combustible: " + tipoCombustible;
    }
}
