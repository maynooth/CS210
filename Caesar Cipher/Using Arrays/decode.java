import java.util.Scanner;

public class decode
{
  
  // method to decode a string
  // accepts the string to decode in parameter one and the number of places to shift in parameter two
  static String decode(String word, int shift)
  {
    // declare arrays of alphabets
    char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char[] alphabetsCaps = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    // convert user inputed sentence to an array of characters
    char[] text = word.toCharArray();

    // string to store the new encoded text
    String decodedText = "";

    for(int i = 0; i < text.length; i++)
    {
      // get current letter
      char letter = text[i];

      // if space, skip replacing
      if(letter == ' ')
      {
        decodedText += " "; // add space to the new encoded string
        continue;
      }

      // check for lowercase alpabets
      for(int j = 0; j < alphabets.length; j++)
      {
        char alpha = alphabets[j];

        // check if current alphabet in word is matched with our alphabets array
        if(letter == alpha)
        {
          int newIndex = j + shift;
          if(newIndex > 25) newIndex = newIndex - 26; // check if value is over than number of alphabets

          char newAlpha = alphabets[newIndex];
          decodedText += newAlpha;

          continue; 
        }

      }


      // check for uppercase alpabets
      for(int j = 0; j < alphabets.length; j++)
      {
        char alpha = alphabetsCaps[j];

        // check if current alphabet in word is matched with our alphabets array
        if(letter == alpha)
        {
          int newIndex = j + shift;
          if(newIndex > 25) newIndex = newIndex - 26; // check if value is over the number of alphabets

          char newAlpha = alphabetsCaps[newIndex];
          decodedText += newAlpha;
          
          continue; 
        }

      }

    }

    return decodedText; // return the encoded text
  }


  public static void main(String args[])
  {

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a message to decrypt:");
    String senten = scan.nextLine();

    // ask user how much to shift and store value
    int shift = 3;
    System.out.println("How much to shift?");
    shift = scan.nextInt();

    String decoded = decode(senten, shift); // pass the string to decode and shift to method to decode
    System.out.println(decoded);


  }

}