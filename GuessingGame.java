import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Choose a random number between 1 and 100 (or any desired range)
        int targetNumber = random.nextInt(100) + 1;

        // Number of guesses allowed
        int guessesRemaining = 5;

        while (guessesRemaining > 0) {
            System.out.printf("Guess the number (1-%d): ", 100);
            int userGuess = scanner.nextInt();

            if (userGuess == targetNumber) {
                System.out
                        .println("Congratulations! You guessed the number in " + (5 - guessesRemaining) + " guesses.");
                break;
            } else if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            guessesRemaining--;

            if (guessesRemaining == 0) {
                System.out.println("Sorry, you ran out of guesses. The number was " + targetNumber + ".");
            }
        }

        scanner.close();
    }
}
