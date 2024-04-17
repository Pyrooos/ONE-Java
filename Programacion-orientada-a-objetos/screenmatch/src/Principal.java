import com.aluracursos.screenmatch.modelos.Movie;

public class Principal {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Enchanted"); ;
        myMovie.setReleaseDate(2021);  ;
        myMovie.setDuration(120); ;
        myMovie.setIncludedInThePlan(true);

        myMovie.showTechnicalSpecifications();
        myMovie.evaluate(7.8);
        myMovie.evaluate(10);
        myMovie.evaluate(7.8);
        System.out.println("Average if evaluations for this movie: "+ myMovie.calculateMedia());
        System.out.println(myMovie.getTotalEvaluations());
        System.out.println(myMovie.calculateMedia());






//        com.aluracursos.screenmatch.modelos.Movie otherMovie = new com.aluracursos.screenmatch.modelos.Movie();
//        otherMovie.name = "Matrix";
//        otherMovie.releaseDate = 1998;
//        otherMovie.duration = 180;
//
//        //otherMovie.showTechnicalSpecifications();

    }
}
