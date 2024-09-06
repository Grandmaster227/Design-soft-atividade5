public class Poupanca extends ContaAbstrata {

    public Poupanca(String NumeroConta, double saldo, Cliente cliente) {
        super(NumeroConta, saldo, cliente);
    }

    public double obterLimite() {
        return getSaldo();
    }
}
