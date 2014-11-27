import java.util.Random;

public class RecordThrows {
    
  // generate a random number from 1 to 6  
  static int throwDice() {
    Random dice = new Random();
    return dice.nextInt(6) + 1;
  }

  public static void main(String args[]) {
    int num = 6000; // number of times to throw the dice

    System.out.println("How many throws of the dice: " + num);

    // array to store the results
    int[][] results = new int[50][6];

    for(int j = 0; j < 50; j++) {

      // throw the dice 6000 times and store the results
      for(int i = 0; i < num; i++) {
        int number = throwDice();
        results[j][number - 1]++;
      }

    }

    // print out results
    System.out.println("Number \t\t Average \t\t Most \t\t Fewest");
    for(int j = 0; j < results[0].length; j++) {
      System.out.print(j + 1 + " \t\t ");

      // find average
      int total = 0;
      for(int i = 0; i < results.length; i++) {
        total += results[0][j];
      }
      double average = total / results.length;
      System.out.print(average + " \t\t ");

      // mmost and fewest times it has occured
      int most = 0;
      int fewest = results[0][j];


      // loop to find the most and fewest
      for(int i = 0; i < results.length; i++) {

        int value_numb = results[i][j];
        if(value_numb < fewest) {
          fewest = results[i][j];
        }

        if(value_numb > most) {
          most = results[i][j];
        }

      }

      System.out.print(most + " \t\t ");
      System.out.print(fewest);

      System.out.println();

    }

  }

}