

public class Dice {

  // private vaiable
  private int number = 0;


  // constructor method
  public Dice() {

  }

  public void roll() {
    number = (int) ((Math.random() * 100) % 6) + 1; // generate a number between 1 - 6
  }

  public int getValue() {
    return number;
  }

}