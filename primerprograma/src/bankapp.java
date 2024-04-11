import java.util.Scanner;

public class bankapp {
    public static void main(String[] args) {

        /*This is the final exercise from the beginner level where we apply all the theory we have learned at the basic level.
        This is necessary for practice and is a requirement for a pass the level.
        Even though it's basic, I took the liberty of increasing the minimum requirements by
        limiting the code to prevent it from malfunctioning
         */

        String name = "Tomy Stark" ;//someone's poor brother

        String accountType = "Checking account";
        double balance = 999.33 ;

        System.out.println("---------------------------------------------------------------");
        System.out.println("                        Bank VVBA                   \n"); //Yes, that isn't that bank
        System.out.println("Customer's name: "+ name);
        System.out.println("Account type: " +accountType);
        System.out.println("Yous available balance is: $"+ balance);

        String menu = """
                *** Please write the number of the option you wish.***
                
                1. Consult balance
                2. Withdraw money
                3. Deposit money
                9. Exit
                
                """;

        Scanner keyboard = new Scanner(System.in);
        int option=0;
        while (option !=9 ){
            System.out.println(menu);
            option = keyboard.nextInt();

            switch (option){
                case 1:
                    System.out.println("\n\nYour balance is $"+balance+"\n\n");
                    break;

                case 2:
                    System.out.println("How much money do you wish to withdraw?");
                    double withdrawalAmount= keyboard.nextDouble();

                    if (withdrawalAmount > balance){
                        System.out.println("\n\nNot enough balance\n\n");
                        break;
                    } else {
                        balance = balance - withdrawalAmount;
                        System.out.println("\n\nYour available balance is: $" +balance+"\n\n");
                        break;
                    }
                case 3:
                    System.out.println("How much money do you want to deposit?");
                    double amountToDeposite = keyboard.nextDouble();
                    balance = balance + amountToDeposite;
                    System.out.println("\n\nYour available balance is: $"+balance+"\n\n");
                    break;
                case 9:
                    break;

                default:
                    System.out.println("invalide option");
            }
        }

    }
}
