import java.util.Scanner;

public class CheckPrimes {

  public static void main(String args[]) {


    Scanner scan = new Scanner(System.in);

    // ask user for input
    System.out.print("Please enter prime to find: ");
    int find = scan.nextInt();

    int array_size = (int) (2 * find * Math.log(find));

    boolean[] myArray = new boolean[array_size];

    // ture and false the other way around from lab notes

    long start = System.currentTimeMillis();

    // loop through numbers from 2 to size of array
    for(int i = 2; i < myArray.length; i++) {

      if(myArray[i] == true) continue; // is not a prime number

      // System.out.println(i); // print out the number

      // set all multiples of this number to true
      int mul = i;
      for(int times = 2; mul < myArray.length; times++) {
        mul = i * times;
        if(mul < myArray.length) myArray[mul] = true; // set to true if that number is in array
      }

    }

    // print out the nth prime number 
    int nth = 0;
    for(int i = 2; nth <= find; i++) {
      if(myArray[i] == false) { // is prime number
        nth++;
        if(nth == find) {
          System.out.println("The " + find + "th prime number is: " + i);
          break;
        }
      }
    }


    long elapsed = System.currentTimeMillis() - start;
    System.out.println("The answer took " + elapsed + " milliseconds to compute");


  }

}