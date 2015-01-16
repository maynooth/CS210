import java.util.Arrays;

public class selection
{

  public static void main(String args[])
  {

    int[] array = {1, 5, 8, 3, 10, 15, 53};


    for(int i = 0; i < array.length - 1; i++)
    {

      int current = array[i];
      int min = current;
      int min_pos = i;

      for(int j = i + 1; j < array.length; j++)
      {
        if(array[j] < current)
        {
          min = array[j];
          min_pos = j;
        }
      }

      array[i] = min;
      array[min_pos] = current;

    }


    System.out.println(Arrays.toString(array));

  }


}