package fundamentosHerencia.Ejercicio03TypeCasting;

public class Perro extends Animal{
    private String raza;

    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public void sonido() {
        System.out.println("El Perro hace GUAU GUAU!!");
    }

    public void ladrar(){
        System.out.println("Perro: Guau Guau!");
    }
}
