package Exercicio3;

public class MainUpcastsAndDowncasts {
  public static void main(String[] args) {
    Funcionario funcionario = new Funcionario("Amanda");
    // Upcasts
    Funcionario gerente = new Gerente("Pedro");
    Funcionario vendedor = new Vendedor("Ricardo");

    // Downcasts - muitas vezes gera erro, porque funcionario para vendedor, pode ter coisas no vendedor que nao tem em funcionario, fazendo assim dar erros. - downcasts não é recomendado.
    Vendedor vendedor_ = (Vendedor) new Funcionario("Gustavo");
  }
}
