import java.util.*;
 
public class Program
{
    public static void main(String[] args)
    {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var step = 0;

// TODO: Implemente uma condição onde seja possível reduzir o número até 0:

        while (num > 0)
        {
            if ((num % 2) == 1)
            {
                num--;
                step++;
            } else {
                num /= 2;
                step++;
            }
        }

	
	    System.out.println(step);
    }
}