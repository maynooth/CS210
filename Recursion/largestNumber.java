public class largestNumber 
{
  
  public static void main(String args[])
  {
    int[] numbers = {0, 1, 6, 3, 8, 7, 3, 16, 9, 4, 5};
    int largest = findLargestNum(numbers);
    System.out.println(largest);
  }

  public static int findLargestNum(int[] numbers) {
    return findLargestNum(numbers, numbers.length - 1);
  }

  public static int findLargestNum(int[] numbers, int index) {
    if(index > 0) {
      int oneLess = findLargestNum(numbers, index - 1);
      return (numbers[index] > oneLess) ? numbers[index] : oneLess;
    }
    return numbers[0];
  }

}