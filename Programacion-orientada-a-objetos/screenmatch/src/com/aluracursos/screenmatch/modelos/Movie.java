package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculations.Rating;

public class Movie extends Title implements Rating {
    private String director;



    public Movie(String name, int releaseDate) {
        super(name, releaseDate);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getRating() {
        return (int) (calculateMedia()/2);
    }

    @Override
    public String toString() {
        return "Movie: " + this.getName() + " ( " + getReleaseDate() + " )";

    }
}
//evoluciona el código para ver temas de herencias y como se llaman de la clase madre, polimorfismo, interfaces