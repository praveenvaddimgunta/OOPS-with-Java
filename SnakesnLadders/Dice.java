import java.util.Random;

public class Dice {

  /*
    This method simulates the behavior of a dice.
    On roll it gives a random number between 1 and 6 (inclusive).
  */
  public static int roll() {
    Random rand = new Random();
    int randomNum = rand.nextInt((6 - 1) + 1) + 1;
    return randomNum;
  }

}