// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Screen Match");
        System.out.println("Movie: Matrix");

        int dateOfRelease = 1999;
        boolean includedInThePlan = true;
        double ratingOfMovie = 8.2;

        double media = (8.2 + 6.0 + 9.0)/3;
        System.out.println("Media: " + media);
        String sinopsis = """
               Matrix is a paradox
               The best movie of the end of this century
               It was launched in: """ + dateOfRelease;
        System.out.println(sinopsis);

        int classification = (int) (media /2);
        System.out.println("classification = " + classification);


    }
}
