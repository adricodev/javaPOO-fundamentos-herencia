package fundamentosHerencia.Ejercicio03TypeCasting;

public abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void sonido();

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
