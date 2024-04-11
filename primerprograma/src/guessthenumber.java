import java.util.Random;
import java.util.Scanner;
public class guessthenumber {
    public static void main(String[] args) {
        /*
        This code is a bit of a challenge for the Allura platform and oracle systems. The proposed conditions state that the program
        should generate a random number and this number should be stored in memory because the user must guess.
        Each attempt should provide a clue indicating if the number is lower or higher.
        */
        int attemptsTry= 0;
        int attemptsLimit=5;
        int secretNumber = new Random().nextInt(100);;
        int userSecretNumber = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println(secretNumber);
        while(attemptsTry < 5){

            System.out.println("Insert one number between 0 and 100 you have "+ (attemptsLimit-attemptsTry) + " try.");
            userSecretNumber=keyboard.nextInt();

            if(secretNumber != userSecretNumber){

                if (secretNumber > userSecretNumber){
                    System.out.println("Sorry, that not is the secret number.");
                    System.out.println("The secret number  is higher.\n" );
                } else{
                    System.out.println("Sorry, that not is the secret number.");
                    System.out.println("The secret number is lower. \n");
                }
                attemptsTry++;
            }else {
                System.out.println("Congratulations! You guessed the secret number.");
                break;
            }
            if (attemptsLimit == attemptsTry){
                System.out.println("Sorry, you haven't more attempts, the secret number is "+secretNumber);
            }
        }
    }
}
