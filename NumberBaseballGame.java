import java.util.Random;
import java.util.Scanner;

public class NumberBaseballGame {

  public static void main(String[] args) {
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);

    int[] computerNumbers = new int[3];
    for (int i = 0; i < 3; i++) {
      computerNumbers[i] = rand.nextInt(9) + 1; // Generates a number between 1 and 9.
      for (int j = 0; j < i; j++) { // Make sure there are no duplicate numbers.
        if (computerNumbers[i] == computerNumbers[j]) {
          i--;
          break;
        }
      }
    }

    while (true) {
      System.out.println("Please enter three numbers:");
      int[] playerNumbers = new int[3];
      for (int i = 0; i < 3; i++) {
        try {
          playerNumbers[i] = readValidInput(scanner);
        } catch (NumberFormatException e) {
          System.out.println("Invalid input. Please enter a valid number.");
          i--;
        }
      }

      int strike = 0;
      int ball = 0;

      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          if (playerNumbers[i] == computerNumbers[j]) {
            if (i == j) {
              strike++;
            } else {
              ball++;
            }
          }
        }
      }

      if (strike == 3) {
        System.out.println("Congratulations! You got all the numbers right!");
        break;
      } else {
        System.out.println(strike + " strike, " + ball + " ball");
      }
    }

    scanner.close();
  }

  private static int readValidInput(Scanner scanner)
    throws NumberFormatException {
    String input = scanner.next();

    if (input.contains("-1")) {
      System.exit(0);
    }
    if (input.length() != 1 || !Character.isDigit(input.charAt(0))) {
      throw new NumberFormatException();
    }
    return Integer.parseInt(input);
  }
}
