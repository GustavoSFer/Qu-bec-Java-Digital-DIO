package Exercicio3;

public class MainUpcastsAndDowncasts {
  public static void main(String[] args) {
    Funcionario funcionario = new Funcionario("Amanda");
    // Upcasts
    Funcionario gerente = new Gerente("Pedro");
    Funcionario vendedor = new Vendedor("Ricardo");

    // Downcasts
    Vendedor vendedor_ = (Vendedor) new Funcionario("Gustavo");
  }
}
