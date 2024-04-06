// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento  = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0)/3;
        System.out.println("Media: " + media);
        String sinopsis = """
               Matrix es una parajoda
               La mejor peliocula del fin del milenio
               Fue lanzada en :
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);
    }
}
