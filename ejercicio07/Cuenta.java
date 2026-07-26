package fundamentosHerencia.ejercicio08;

public class Cuenta {
    protected String iban;
    protected Cliente titular;
    protected double saldo;

    public Cuenta(String iban, Cliente titular, double saldo) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getIban() {
        return iban;
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto){
        saldo += monto;
    };

    public boolean retirar(double monto){
        if(monto <= saldo){
            saldo -= monto;
            return true;
        }else {
            return false;
        }
    };

    public boolean transferir(Cuenta destino, double monto){
        if(this.retirar(monto)){
            destino.depositar(monto);
            return true;
        }else {
            return false;
        }
    };

    @Override
    public String toString() {
        return "Cuenta{" +
                "iban='" + iban + '\'' +
                ", titular=" + titular +
                ", saldo=" + saldo +
                '}';
    }
}
