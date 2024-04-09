import java.util.Scanner;

public class evaluations {
    public static void main(String[] args) {

        //simple example how to make a loop with a conditionals While, if and show how to limit the above writing '-1'

        Scanner keyboard = new Scanner(System.in);
        double rating = 0;
        double averageOfEvaluations=0;
        double totalRatings=0;

        while (rating !=-1) {
            System.out.println("Write the rating would give it ");
            rating = keyboard.nextDouble();

            if (rating != -1) {
                averageOfEvaluations += rating;
                totalRatings++;

            }
        }System.out.println("The average rating of the movie is:" + averageOfEvaluations / totalRatings);
    }
}

