package com.aluracursos.spotyube.modelos;

public class MyFavorites {
    public void add(Audio audio){
        if (audio.getRating() >= 8) {
            System.out.println(audio.getTitle()+ "This song is popular right now");
        }else {
            System.out.println(audio.getTitle()+ "This is a favorite");
        }
    }
}
