/*
  @author Daniel Paul
*/

import java.util.Scanner;

public class one
{
  
  public static void main(String args[])
  {

    Scanner scan = new Scanner(System.in);

    // get input from user
    System.out.println("Count prime numbers up to: ");
    int n = scan.nextInt();

    // variable to keep count of the number of primes
    int count = 0;

    // loop from 2 to n
    for(int i = 2; i <= n; i++)
    {
      // assume it is a prime number at start
      boolean divisible = false;

      // loop from 2 to the number we are currently checking to see if it is divisible by any smaller number
      for(int j = 2; j < i; j++)
      {
        if(i % j == 0) divisible = true;
      }

      // if it is not divisible by any other number (other than 1 and itself), then it is a prime number
      if(!divisible) count++;
    }

    // print out the count
    System.out.println(count);


  }

}