import java.util.Arrays;

public class insertion
{

  public static void main(String args[])
  {

    int[] array = {1, 5, 8, 3, 10, 15, 53};


    for(int i = 1; i < array.length; i++)
    {
      int current = array[i];
      int inner = i;

      // loop to shift elements to make space
      while(inner > 0 && array[inner - 1] >= current)
      {
        array[inner] = array[inner - 1];
        inner--;
      }

      array[inner] = current;
    }

    System.out.println(Arrays.toString(array));

  }


}