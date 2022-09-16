import java.util.ArrayList;
import java.util.Scanner;

class Temperatura {
  public static void main(String[] args) {
    ArrayList <Integer> temperaturas = new ArrayList<Integer>();
    ArrayList <Integer> tempAcimaDaMedia = new ArrayList<Integer>();
    Scanner teclado = new Scanner(System.in);
  
    for (int i = 0; i < 6; i++) {
      System.out.println("Informe a " + (i + 1) + "º temperatura do ano: ");
      temperaturas.add(teclado.nextInt());
    };

    Integer soma = temperaturas.stream().mapToInt(Integer::intValue).sum();
    Integer tempMedia = soma / 6;

    for (Integer teste : temperaturas) {
      if (teste > tempMedia) {
        tempAcimaDaMedia.add(teste);
      }
    };

    System.out.println("A temperatura média ficou em: " + tempMedia);
    System.out.println(" as temperatura acima da média são: " + tempAcimaDaMedia);
    teclado.close();
  }
}