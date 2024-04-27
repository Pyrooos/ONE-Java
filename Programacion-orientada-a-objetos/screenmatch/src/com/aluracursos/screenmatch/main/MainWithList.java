package com.aluracursos.screenmatch.main;

import com.aluracursos.screenmatch.modelos.Movie;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Title;

import java.util.*;

public class MainWithList {
    public static void main(String[] args) {

        Movie myMovie = new Movie("Enchanted", 2021);
        myMovie.evaluate(9);
        Movie otherMovie = new Movie("Matrix",1998);
        myMovie.evaluate(7);
        var favoriteFilmOfCris = new Movie("Harry Potter",2000);
        myMovie.evaluate(8);
        Serie fallout = new Serie("Fallout",2024);

        ArrayList<Title> list = new ArrayList<>();
        list.add(favoriteFilmOfCris);
        list.add(otherMovie);
        list.add(myMovie);
        list.add((fallout));

        for (Title item:list) {
            System.out.println(item.getName());
            if(item instanceof Movie movie && movie.getRating() > 2){
                System.out.println(movie.getRating());
            }
        }
        ArrayList<String> listOfArtist = new ArrayList<>();
        listOfArtist.add("Penelope Cruz");
        listOfArtist.add("Antonio Banderas");
        listOfArtist.add("Ricardo Darin");

        Collections.sort(listOfArtist);
        System.out.println("List of artist ordered" + listOfArtist);

        Collections.sort(list);
        System.out.println("Ordered list of titles "+ list);

        list.sort(Comparator.comparing(Title::getReleaseDate));
        System.out.println("Ordered list of titles per year"+ list);
    }
}
