public abstract class ContaAbstrata {
    public String numeroConta;

    public Cliente cliente;

    public double saldo;

    public ContaAbstrata(String numeroConta, double saldo, Cliente cliente) {
            this.numeroConta = numeroConta;
            this.cliente = cliente;
            this.saldo  = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String NumeroConta) {
        this.numeroConta = NumeroConta;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double depositar(double valor) {
        this.saldo += valor;
        return this.saldo;

    }

    public double sacar(double valor) {
            this.saldo -= valor;
            return this.saldo;
    }

    public abstract double obterLimite();



}
