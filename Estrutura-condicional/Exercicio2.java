// Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.util.Scanner; 

public class Exercicio2 {
    
  public static void main(String[] args){ 
    Scanner leitor = new Scanner(System.in); 
    int t = leitor.nextInt(); 
    int n = 0;
      
    for(int i = 0; i < 100; i++) {
      System.out.println("N[" + i  + "] = "+  n );
      n++;
      if(t == n) {
        n = 0;
      }
    }
  }
}