import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, write the credit card limit");
        double limit = keyboard.nextDouble();
        CreditCard card = new CreditCard(limit);

        int exit = 1;

        while (exit !=0){
            System.out.println("Write the description of your purchase ");
            String description = keyboard.next();

            System.out.println("Write the price your purchase");
            double value = Double.valueOf(keyboard.nextDouble());

            Purchase purchase = new Purchase(value, description);
            boolean completedPurchase = card.initiatePurchase(purchase);

            if (completedPurchase){
                System.out.println("Completed purchase");
                System.out.println("Write 0 to exit or 1 to continue");
                exit = keyboard.nextInt();
            } else {
                System.out.println("Insufficient balance");
                exit = 0;
            }
        }
        System.out.println("**********************************");
        System.out.println("Purchases made: \n");
        for (Purchase purchase : card.getListOfPurchases()) {
            System.out.println(purchase.getDescription()+ " - " + purchase.getValue() );
        }
        System.out.println("\n*******************");
        System.out.println("Balance on the credit card: " + card.getBalance());
    }
}
