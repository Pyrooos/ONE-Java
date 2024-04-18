import com.aluracursos.screenmatch.calculations.RecommendationFilter;
import com.aluracursos.screenmatch.calculations.TimeCalculator;
import com.aluracursos.screenmatch.modelos.Episode;
import com.aluracursos.screenmatch.modelos.Movie;
import com.aluracursos.screenmatch.modelos.Serie;
/*
This code is for explain topics like class,inheritance, mother class, polymorphism and interfaces. This example is a
basic in object-oriented with Java, show how to do things respect these topics.
                                      o showing how to work with these topics
*/
public class Principal {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Enchanted"); ;
        myMovie.setReleaseDate(2021);  ;
        myMovie.setDurationInMinutes(120); ;
        myMovie.setIncludedInThePlan(true);

        myMovie.showTechnicalSpecifications();

        myMovie.evaluate(7.8);
        myMovie.evaluate(10);
        myMovie.evaluate(7.8);
        System.out.println("Average if evaluations for this movie: "+ myMovie.calculateMedia());
        System.out.println(myMovie.getTotalEvaluations());
        System.out.println(myMovie.calculateMedia());



        Serie fallout = new Serie();
        fallout.setName("Fallout");
        fallout.setReleaseDate(2024);
        fallout.setTemps(1);
        fallout.setMinutesPerEpisode(50);
        fallout.setEpisodesPerSeason(10);
        fallout.showTechnicalSpecifications();
        System.out.println(fallout.getDurationInMinutes());

        Movie otherMovie = new Movie();
        otherMovie.setName("Matrix");
        otherMovie.setReleaseDate(1998);
        otherMovie.setDurationInMinutes(180);

        TimeCalculator calculator = new TimeCalculator();
        calculator.included(myMovie);
        calculator.included(fallout);
        calculator.included(otherMovie);
        System.out.println(calculator.getTotalTime());

        RecommendationFilter recommendationFilter = new RecommendationFilter();
        recommendationFilter.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setName("The end");
        episode.setSerie(fallout);
        episode.setTotalViews(50);
        recommendationFilter.filter(episode);



        //otherMovie.showTechnicalSpecifications();

    }
}
