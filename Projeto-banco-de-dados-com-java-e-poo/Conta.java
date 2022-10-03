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
    this.saldo -= valor;    
  }

  @Override
  public void depositar(double valor) {
  this.saldo += valor;    
  }

  @Override
  public void transferir(double valor, Conta contaDestino) {
    this.sacar(valor);  
    contaDestino.depositar(valor);
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
