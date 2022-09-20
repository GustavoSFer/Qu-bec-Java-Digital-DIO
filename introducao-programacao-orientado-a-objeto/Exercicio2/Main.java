package Exercicio2;

public class Main {
  public static void main(String[] args) {
    Carro bmw = new Carro();
    bmw.setModelo("BMW");
    bmw.setCor("Branco");
    bmw.setCapacidadeTanque(20);
    
    System.out.println("Modelo: " + bmw.getModelo());

  }
}
