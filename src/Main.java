import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1;
        int guess;


        do {
            System.out.print("Guess a number between 1 and 10: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer between 1 and 10.");
                scanner.next(); // clear the invalid input
            }
            guess = scanner.nextInt();
            if (guess < 1 || guess > 10) {
                System.out.println("Please guess a number between 1 and 10.");
            }
        } while (guess < 1 || guess > 10);


        System.out.println("The random number is: " + randomNumber);


        if (guess < randomNumber) {
            System.out.println("Your guess is too low!");
        } else if (guess > randomNumber) {
            System.out.println("Your guess is too high!");
        } else {
            System.out.println("Congratulations! You guessed it right!");
        }


        scanner.close();
    }
}