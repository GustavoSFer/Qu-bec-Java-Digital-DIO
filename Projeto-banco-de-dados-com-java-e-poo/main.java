public class main {
  public static void main(String[] args) {
    Conta contaCorrente = new ContaCorrente();
    Conta contaPoupanca = new ContaPoupanca();

    contaCorrente.depositar(150);

    contaCorrente.imprimirExtrato();
    System.out.println();
    contaPoupanca.imprimirExtrato();

    contaCorrente.transferir(150, contaPoupanca);
    System.out.println("==========");

    contaCorrente.imprimirExtrato();
    System.out.println();
    contaPoupanca.imprimirExtrato();
  }
}
