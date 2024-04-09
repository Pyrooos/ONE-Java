import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        //this exercise is a simple example of how variables are handled within a loops

        Scanner keyboard = new Scanner(System.in);
        double rating = 0;
        double mediaRatings= 0;


        for (int i = 0; i < 3; i++){
            System.out.println("Write the rating would you give to movie ");
            rating = keyboard.nextDouble();
            mediaRatings = mediaRatings + rating;


        }
        System.out.println("The media rating of movie is: " +mediaRatings/3);
    }
}
