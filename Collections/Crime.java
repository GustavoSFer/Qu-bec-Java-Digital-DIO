import java.util.ArrayList;
import java.util.Scanner;

public class Crime {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    ArrayList <Integer> perguntas = new ArrayList<Integer>();
    int contador = 0;

    System.out.println("Telefonou para a vítima? (1 para sim / 0 para não) ");
    perguntas.add(teclado.nextInt());

    System.out.println("Esteve no local do crime? (1 para sim / 0 para não) ");
    perguntas.add(teclado.nextInt());

    System.out.println("Mora perto da vítima? (1 para sim / 0 para não) ");
    perguntas.add(teclado.nextInt());

    System.out.println("Devia para a vítima? (1 para sim / 0 para não) ");
    perguntas.add(teclado.nextInt());

    System.out.println("Já trabalhou com a vítima? (1 para sim / 0 para não) ");
    perguntas.add(teclado.nextInt());

    for (Integer verdade : perguntas) {
      if (verdade == 1) contador += 1;
    }

    switch(contador) {
      case 2:
        System.out.println("Suspeito");
        break;
      case 3:
      case 4:
        System.out.println("Cúmplice");
        break;
      case 5:
        System.out.println("Assassina");
        break;
      default:
        System.out.println("Livre");  
    }
    teclado.close();
  }
}
