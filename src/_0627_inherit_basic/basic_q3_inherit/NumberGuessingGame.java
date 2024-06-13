package _0627_inherit_basic.basic_q3_inherit;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        int attempts = 5;
        boolean hasGuessedCorrectly = false;

        System.out.println("Number Guessing Game");
        System.out.println("Guess the number between 1 and 100:");

        while (attempts > 0) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                hasGuessedCorrectly = true;
                break;
            } else if (userGuess < targetNumber) {
                attempts--;
                System.out.println("Too low! Attempts left: " + attempts);
            } else {
                attempts--;
                System.out.println("Too high! Attempts left: " + attempts);
            }
        }

        if (!hasGuessedCorrectly) {
            System.out.println("Sorry! You've run out of attempts. The correct number was " + targetNumber);
        }

        scanner.close();
    }
}