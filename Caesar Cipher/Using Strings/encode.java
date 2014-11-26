import java.util.Scanner;

public class encode
{
  
  public static void main(String args[])
  {

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a message to encrypt:");
    String senten = scan.nextLine();

    int shift = 3;
    System.out.println("How much to shift?");
    shift = scan.nextInt();


    String alpha = "abcdefghijklmnopqrstuvwxyz";
    String alphaCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    System.out.println("The encrypted message is: ");

    for(int i = 0; i < senten.length(); i++)
    {
      char letter = senten.charAt(i);

      if(letter == ' ') 
      {
        System.out.print(" ");
        continue;
      }


      char newLetter = ' ';

      if(alpha.indexOf(letter) == -1) 
      {
        int index = alphaCaps.indexOf(letter) - shift;
        if(index < 0) index = 26 + index;
        newLetter = alphaCaps.charAt(index);
      }
      else
      {
        int index = alpha.indexOf(letter) - shift;
        if(index < 0) index = 26 + index;
        newLetter = alpha.charAt(index);
      }


      System.out.print(newLetter);
    }

    System.out.println();

  }

}