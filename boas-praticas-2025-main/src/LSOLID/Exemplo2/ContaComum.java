package LSOLID.Exemplo2;

public class ContaComum implements Conta {
    protected double saldo;

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}
