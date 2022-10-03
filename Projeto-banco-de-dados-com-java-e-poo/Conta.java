public abstract class Conta implements IConta {
  private int agencia;
  private int conta;
  private double saldo;

  @Override
  public void sacar(double valor) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void depositar(double valor) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void transferir(double valor, Conta contaDestino) {
    // TODO Auto-generated method stub
    
  }

  public int getAgencia() {
    return this.agencia;
  }

  public int getConta() {
    return this.conta;
  }

  public double getSaldo() {
    return this.saldo;
  }

}
