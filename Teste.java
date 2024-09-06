public class Teste {
    public static void main(String[] args) {
        IBancoGeral bancoItau = new BancoItau();

        Cliente cli = new Cliente("Jujuba pires", "83214567091234");
        ContaAbstrata poupanca = bancoItau.abrirConta(cli, "1", 1000.0, "Poupanca");
        ContaAbstrata contaCorrente = bancoItau.abrirConta(cli, "2", 120.0, "ContaCorrente");

        bancoItau.depositar(poupanca, 140.0);
        bancoItau.depositar(contaCorrente, 220.0);

        bancoItau.sacar(poupanca, 50.0);
        bancoItau.sacar(contaCorrente, 100.0);

        System.out.println("Saldo da poupança: " + poupanca.getSaldo());
        System.out.println("Saldo da conta corrente: " + contaCorrente.getSaldo());
    }
}
