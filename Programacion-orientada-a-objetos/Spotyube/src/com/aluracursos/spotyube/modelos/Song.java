package com.aluracursos.spotyube.modelos;

public class Song extends Audio{
    private String album;
    private String bandOrSinger;
    private String genre;

    @Override
    public int getRating() {
        if (getTotalLikes() > 5000){
            return 8;
        } else{
            return 4;
        }
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getBandOrSinger() {
        return bandOrSinger;
    }
    public void setBandOrSinger(String bandOrSinger) {
        this.bandOrSinger = bandOrSinger;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
