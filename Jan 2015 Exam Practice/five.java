/*
  @author Daniel Paul
*/

public class five
{
  
  public static void main(String args[])
  {

    int[] array = {-5, -1, 2, -3, 0, -3, 3};
    System.out.println(findSum(array, 3));
  }


  public static int findSum(int[] array, int n)
  {
    int sum = 0;
    boolean changed = false;

    for(int i = 0; i <= array.length - n; i++)
    {
      int newSum = 0;
      for(int j = i; j < i + n; j++)
      {
        newSum += array[j];
      }
      // System.out.println(newSum);
      
      if(!changed)
      {
        sum = newSum;
        changed = true;
      }
      else if(newSum > sum)
      {
        sum = newSum;
      }
    }

    return sum;
  }

  // Shortened using max function
  public static int findSumAlt(int[] array, int n) {
    int sum = 0;

    for(int i = 0; i <= array.length - n; i++) {
      int newSum = 0;

      for(int j = i; j < i + n; j++) {
        newSum += array[j];
      }

      sum = Math.max(sum, newSum);
    }
    
    return sum;
  }
}