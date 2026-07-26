package fundamentosHerencia.ejercicio08;

public class Banco {
    private String nombre;
    Cuenta[] cuentas;

    public Banco(String nombre, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void mostrarTransferencia(Cuenta origen, Cuenta destino, double monto, boolean resultado){
        StringBuilder sb = new StringBuilder("Transferencias realizadas: ")
                .append("Cuenta origen: " + origen+"\n")
                .append("Cuenta destino: " + destino+"\n")
                .append("Cantidad transferida: " + monto+"\n")
                .append("Transferencia completada: " + resultado);
        System.out.println(sb.toString());
    }
}
