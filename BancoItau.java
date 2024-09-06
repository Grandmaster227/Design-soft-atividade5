public class BancoItau implements IBancoGeral {
    public ContaAbstrata abrirConta(Cliente cliente, String numeroConta, double saldoInicial, String tipo) {
        if (tipo.equalsIgnoreCase("Poupanca")) {
            return new Poupanca(numeroConta, saldoInicial, cliente);
        } else if (tipo.equalsIgnoreCase("ContaCorrente")) {
            double limChequeEspecial = 1300;
            return new ContaCorrente(numeroConta, saldoInicial, cliente, limChequeEspecial);
        }
        return null;
    }

    public boolean sacar(ContaAbstrata acc, double valor) {
        if (valor > 0 && valor <= acc.obterLimite()) {
            acc.sacar(valor);
            return true;
        }
        return false;
    }

    public boolean depositar(ContaAbstrata acc, double valor) {
        if (valor > 0) {
            acc.depositar(valor);
            return true;
        }
        return false;
    }
}