public class MainCarro {
  public static void main(String[] args) {
    // Criando um Objeto vazio e passando os paramente pelo set
    Carro uno = new Carro();
    uno.setCor("vermelho");
    uno.setModelo("uno");
    uno.setCapacidadeTanque(40.5);

    System.out.println("Modelo: " + uno.getModelo());
    System.out.println("Cor: " + uno.getCor());
    System.out.println("Valor para encher o tanque: " + uno.encherTanque(4.35));

    // Criando um Objeto passando informações pelo construtor
    Carro hb20 = new Carro("Branco", "Hb20", 32.0);

    System.out.println("Modelo: " + hb20.getModelo());
    System.out.println("Cor: " + hb20.getCor());
    System.out.println("Valor para encher o tanque: " + hb20.encherTanque(4.35));
  }
}
