public class ContaPoupanca extends Conta {

  @Override
  public void imprimirExtrato() {
    System.out.println("Conta Poupança:");
    System.out.println("Agencia: " + super.agencia);
    System.out.println("Conta: " + super.conta);
    System.out.println("Saldo: " + super.saldo);
  }
  
}
