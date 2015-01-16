import java.util.Scanner;

public class one
{
  
  public static void main(String args[])
  {

    Scanner scan = new Scanner(System.in);

    System.out.println("Count prime numbers up to: ");
    int n = scan.nextInt();

    int count = 0;

    for(int i = 2; i <= n; i++)
    {
      boolean divisible = false;

      for(int j = 2; j < i; j++)
      {
        if(i % j == 0) divisible = true;
      }

      if(!divisible) count++;

    }


    System.out.println(count);


  }

}