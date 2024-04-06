import java.util.Random;/*
int
public class TryToGuessTheNumber {
    public static void main(String[] args) {
        Random genNumber= new Random();
        int numberToGuess = genNumber.nextInt(11-1);
        int yourGuess
    }
}
*/
import java.util.Scanner;

public class TryToGuessTheNumber {



    public static void main(String[] args) {
        Random generator = new Random();
        int numberToGuess = generator.nextInt(10 - 1) + 1;
        int yourGuess;

        Scanner input = new Scanner(System.in);
        int guess = 0;
        boolean win = false;



        while (!win) {
            System.out.println("Guess a number between 1 and 10: ");
            yourGuess = input.nextInt();
            guess++;

            if (yourGuess < 1 || guess > 10) {
                System.out.println("Guess is out of range! Enter a number between 1 and 10");
                continue;
            }

            if (yourGuess == numberToGuess) {
                win = true;
                break;
            }

            if (yourGuess < numberToGuess) {
                System.out.println("Your guess is too low");
            } else {

                System.out.println("Your guess is too high");
            }
        }

        if (win) {
            System.out.println("You win!");
            System.out.println("The number was " + numberToGuess);
            System.out.println("It took you " + guess + " tries.");

        }
    }
}