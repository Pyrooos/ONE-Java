package com.aluracursos.spotyube.principal;

import com.aluracursos.spotyube.modelos.MyFavorites;
import com.aluracursos.spotyube.modelos.Podcast;
import com.aluracursos.spotyube.modelos.Song;

public class Principal {
    public static void main(String[] args) {
        Song mySong = new Song();
        mySong.setTitle("Arabella ");
        mySong.setBandOrSinger("Arctics Monkeys ");

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("Ned's Declassified Podcast Survival Guide");
        myPodcast.setDescription("Get ready Ned Head’s, we’re going all the way back to the first day of school! Devon Werkheiser (Ned), Lindsey Shaw (Moze) & Daniel Curtis Lee (Cookie) take a trip down memory lane as they look back on the audition process, the original pilot, and some of their favorite (and most cringy) memories from shooting the first episode. Get ready to laugh at the trio’s real life middle school memories together - from the fart stories to the tickle fights.");
        //Song
        for (int i = 0; i < 1100; i++) {
            mySong.like();
        }
        for (int i = 0; i < 15000; i++) {
            mySong.views();
        }
        //Podcast
        for (int i = 0; i < 300; i++) {
            myPodcast.like();
        }
        for (int i = 0; i < 8000; i++) {
            myPodcast.views();
        }
        System.out.println("Total number of views: " + mySong.getTotalNumberOfViews());
        System.out.println("Total number of likes: " + mySong.getTotalLikes());

        MyFavorites favorites = new MyFavorites();
        favorites.add(myPodcast);
        favorites.add(mySong);
    }
}
