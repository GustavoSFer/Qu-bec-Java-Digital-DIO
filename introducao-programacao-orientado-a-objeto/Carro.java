class Carro {
  String cor;
  String modelo;
  Double capacidadeTanque;

  Carro() {} // Construtor - sem parametro, caso seja criando um objeto sem informar as informações.

  Carro(String cor, String modelo, Double capacidadeTanque) { // Contructor
    this.cor = cor;
    this.modelo = modelo;
    this.capacidadeTanque = capacidadeTanque;
  };

  Double encherTanque(Double valorCombustivel) {
    Double valor = this.capacidadeTanque * valorCombustivel;
    return valor;
  }

  void frear() {
    System.out.println("Freando o carro!!");
  };

  void acelerar() {
    System.out.println("Acelerando o carro.");
  };

  void setCor(String cor) {
    this.cor = cor;
  };

  String getCor() {
    return this.cor;
  };

  void setModelo(String modelo) {
    this.modelo = modelo;
  };

  String getModelo() {
    return this.modelo;
  };

  void setCapacidadeTanque(Double capacidadeTanque) {
    this.capacidadeTanque = capacidadeTanque;
  };

  Double getCapacidadeTanque() {
    return this.capacidadeTanque;
  };

}