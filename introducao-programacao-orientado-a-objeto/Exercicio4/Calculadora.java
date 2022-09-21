package Exercicio4;

// Como estamos implementado da interface de IOperacaoMatematica
// Somo obrigatos a implementar todos os metodos de IOperacaoMatematica
public class Calculadora implements IOperacaoMatematica {

  @Override
  public void soma(Double a, Double b) {
    System.out.println("A soma é: " + (a + b));
  }

  @Override
  public void subtracao(Double a, Double b) {
    System.out.println("A Subtração é: " + (a - b));
  }

  @Override
  public void multiplicacao(Double a, Double b) {
    System.out.println("A Multiplicação é: " + (a * b));
  }

  @Override
  public void divisao(Double a, Double b) {
    System.out.println("A Divisão é: " + (a / b));    
  }
}
