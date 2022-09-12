// Conceituação
//  "um espeço na memória do computador, onde se pode guardar valores"

// Criação
// <?Visibilidade>   <?Modificador> Tipo   Nome   <?=valorInicial>
  // V: 'public', 'protected', 'private'
  // M: 'static' e 'final'
  // T: Tipo de dado
  // N: Nome que é fornecido a variavel
  // VI: Um valor inicial, caso se deseja.

class Variaveis {
  public static void main(String[] args) {

    System.out.println("Hello word!");
    int numero = 1;
    System.out.println(numero);

    final String NUMERO_CONSTANTE = "Variavel que é constante";
    System.out.println(NUMERO_CONSTANTE);
  }
};