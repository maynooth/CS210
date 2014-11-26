public class DiceMonteCarlo {

  public static void main(String args[]) {

    Dice[] myDice = new Dice[5]; // declare array of dice

    // loop through each space in array and create dice object
    for(int i = 0; i < myDice.length; i++) {
      myDice[i] = new Dice();
    }

    // array of values we get
    int[] results = new int[30]; // array with 30 spaces

    // loop that runs a million times
    for(int i = 0; i < 1000000; i++) {

      // total of this roll
      int total = 0;

      // roll all the dice
      for(int j = 0; j < myDice.length; j++) {
        // roll this dice
        myDice[j].roll();
        // add the number to total
        total += myDice[j].getValue();
      }

      // store the total in the results array
      results[total - 1] += 1; // minus one to go one index back in array

      // System.out.println("Roll " + i + " total: " + total);

    }


    // print out the results array
    System.out.println("Resutls:");
    System.out.println("----------");
    for(int i = 0; i < results.length; i++) {
      System.out.println("Number of times " + (i + 1) + " was the total: " + results[i]);
      // System.out.println(results[i]);
    }

  }

}