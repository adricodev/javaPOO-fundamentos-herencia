package fundamentosHerencia.ejercicio08;

public class CuentaCorriente extends Cuenta{
    private double limiteDescubierto;

    public CuentaCorriente(String iban, Cliente titular, double saldo, double limiteDescubierto) {
        super(iban, titular, saldo);
        this.limiteDescubierto = limiteDescubierto;
    }

    public double getLimiteDescubierto() {
        return limiteDescubierto;
    }

    @Override
    public boolean retirar(double monto) {
        if(monto <= saldo + limiteDescubierto){
            saldo -= monto;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "limiteDescubierto=" + limiteDescubierto +
                ", iban='" + iban + '\'' +
                ", titular=" + titular +
                ", saldo=" + saldo +
                '}';
    }
}
