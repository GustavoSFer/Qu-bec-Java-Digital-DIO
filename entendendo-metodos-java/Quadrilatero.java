public class Quadrilatero {
  public static void area(double lado) {
    System.out.println("A Area do quadrado é " + lado * lado);
  };

  public static void area(double lado1, double lado2) {
    System.out.println("A Area do retangulo é " + lado1 * lado2);
  };

  public static void area(double baseMenor, double baseMaior, double altura) {
    System.out.println("A Area do triangulo é " + ((baseMaior + baseMenor) * altura) / 2);
  };
}