import java.util.Arrays;

public class four
{

  public static void main(String args[])
  {
    // array of stings to sort by unique characters count
    String[] names = {"Daniel", "Levin", "Alexandra", "Jonatan", "Stark", "Zipporah", "Tommy", "Lisa", "Anderson", "Tom"};

    System.out.println(Arrays.toString(sortByUnique(names)));
  }

  /*
    A Java method that takes in an array of strings and sorts them 
    by the number of unique characters in each string.
  */

  public static String[] sortByUnique(String[] array)
  {

    // loop through each array strings and bubble sort based on the length
    boolean swaped = false;

    do
    {
      swaped = false;

      for(int i = 0; i < array.length - 1; i ++)
      {
        String current = array[i];

        if(countUnique(array[i]) > countUnique(array[i + 1]))
        {
          // swap
          array[i] = array[i + 1];
          array[i + 1] = current;

          swaped = true;
        }
      }

    } while(swaped);


    return array;

  } // END sortByUnique


  /*
    Method to find the number of unique characters in a string
  */
  public static int countUnique(String word)
  {
    String unique = ""; // variable to store only unique characters

    // loop through each character in string
    for(int i = 0; i < word.length(); i++)
    {
      char c = word.charAt(i);
      // check if we do not this string in our unique string, then add
      if(unique.indexOf(c) == -1) unique += c;
    }

    return unique.length();
  } // END countUnique



}