import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int minRange = 1;
            int maxRange = 100;
            int maxAttempts = 10;
            int score = 0;

            boolean playAgain = true;
            while (playAgain) {
                int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
                System.out.println("Welcome to the Number Guessing Game!");
                System.out.println("I have selected a number between " + minRange + " and " + maxRange + ". Try to guess it!");

                int attempts = 0;
                while (attempts < maxAttempts) {
                    System.out.print("Enter your guess Number: ");
                    int userGuess = scanner.nextInt();
                    attempts++;

                    if (userGuess < generatedNumber) {
                        System.out.println("Too low! Try again.");
                    } else if (userGuess > generatedNumber) {
                        System.out.println("Too high! Try again.");
                    } else {
                        System.out.println("Congratulations! You guessed the number " + generatedNumber + " in " + attempts + " attempts.");
                        score += maxAttempts - attempts + 1;
                        break;
                    }
                }

                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + generatedNumber);
                }

                System.out.print("Do you want to play again? (yes/no): ");
                String playAgainResponse = scanner.next().toLowerCase();
                playAgain = playAgainResponse.equals("yes");
            }

            System.out.println("Thanks for playing! Your total score is: " + score);
    }
}