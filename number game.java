import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess;
        boolean repeat = false;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a numbe30 between 1 and 100.");
        System.out.println("Can you guess what it is?");

        while (!repeat) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;
            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                repeat = true;
                System.out.println("Congratulations! You've guessed the correct number.");
                System.out.println("It took you " + numberOfTries + " tries.");
            }
        }

        scanner.close();
}
}
