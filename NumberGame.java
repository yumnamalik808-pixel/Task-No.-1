import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;

        do {
            int attempts = 0;
            int score = 0;
            int randomNumber = random.nextInt(100) + 1; // Generate random number between 1 and 100
            int userGuess = 0;

            System.out.println("Guess the number (between 1 and 100):");

            while (userGuess != randomNumber) {
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number: " + randomNumber);
                }
            }

            // Calculate score based on attempts
            score = 100 - (attempts - 1) * 10; // Example scoring system
            score = Math.max(score, 0); // Ensure score is not negative
            System.out.println("Your score: " + score);

            System.out.println("Do you want to play again? (true/false)");
            playAgain = scanner.nextBoolean();

        } while (playAgain);

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
