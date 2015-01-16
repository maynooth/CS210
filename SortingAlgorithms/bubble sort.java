
import java.util.Arrays;

public class bubble
{

  public static void main(String args[])
  {

    int[] array = {1, 5, 8, 3, 10, 15, 53};


    boolean swaped = false;
    do
    {
      swaped = false;

      for(int i = 0; i < array.length - 1; i++)
      {
        if(array[i] > array[i + 1])
        {
          int temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;

          swaped = true;
        }
      }

    } while(swaped);



    System.out.println(Arrays.toString(array));



  }

}