import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalScore = 0;

       
        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
            int attempts = 0;
            int maxAttempts = 10;
            boolean guessedCorrectly = false;
            
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have chosen a number between 1 and 100. Try to guess it.");
            System.out.println("You have " + maxAttempts + " attempts.");

            
            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number correctly in " + attempts + " attempts.");
                    guessedCorrectly = true;

                   
                    totalScore += (maxAttempts - attempts) + 1;
                } else if (userGuess > numberToGuess) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Your guess is too low.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("You've run out of attempts. The number was " + numberToGuess + ".");
            }

            System.out.println("Your current score is: " + totalScore);

            
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();

           
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing! Your final score is: " + totalScore);
        scanner.close();
    }
}
