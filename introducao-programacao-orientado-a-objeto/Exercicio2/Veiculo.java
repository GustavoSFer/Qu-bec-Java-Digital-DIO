package Exercicio2;

public class Veiculo {
  String modelo;
  String cor;
  Integer capacidadeTanque;

  Veiculo() {};
  Veiculo(String modelo, String cor, Integer capacidadeTanque) {
    this.modelo = modelo;
    this.cor = cor;
    this.capacidadeTanque = capacidadeTanque;
  };

  Integer encherTanque(Integer valorCombustivel) {
    return this.capacidadeTanque * valorCombustivel;
  }

  void setModelo(String modelo) {
    this.modelo = modelo;
  };
  String getModelo() {
    return this.modelo;
  };

  void setCor(String cor) {
    this.cor = cor;
  };
  String getCor() {
    return this.cor;
  };

  void setCapacidadeTanque(Integer capacidade) {
    this.capacidadeTanque = capacidade;
  };
}
