import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        //This exercise is a way to display the final form of the program, the frontend still needs to be finished.

        Scanner keyboard = new Scanner(System.in);
        System.out.println("write the name of your favorite movie");
        String movie= keyboard.nextLine();
        System.out.println("Now write the release date");
        int releaseDate = keyboard.nextInt();
        System.out.println("Finally, what rating would you give it?");
        double rating = keyboard.nextDouble();

        System.out.println("Movie = " + movie);
        System.out.println("ReleaseDate = " + releaseDate);
        System.out.println("Rating = " + rating);

    }
}
