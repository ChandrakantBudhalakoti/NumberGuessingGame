import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        do {
            int minRange = 1;  // Set your desired minimum rangeS
            int maxRange = 100;  // Set your desired maximum range
            int secretNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int maxAttempts = 5;  // Set the number of attempts allowed
            int attempts = 0;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I've selected a number between " + minRange + " and " + maxRange + ". Try to guess it.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < secretNumber) {
                    System.out.println("Too low! You have " + (maxAttempts - attempts) + " attempts left.");
                } else if (userGuess > secretNumber) {
                    System.out.println("Too high! You have " + (maxAttempts - attempts) + " attempts left.");
                } else {
                    System.out.println("Congratulations! You've guessed the correct number: " + secretNumber);
                    break;
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + secretNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for playing. Goodbye! <3");
                break;
            }
        } while (true);

        scanner.close();
    }
}
