public abstract class Conta implements IConta {

  protected static final int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1;

  protected int agencia;
  protected int conta;
  protected double saldo;

  public Conta() {
    this.agencia = AGENCIA_PADRAO;
    this.conta = SEQUENCIAL++;
    this.saldo = 0;
  }

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
