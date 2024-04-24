package com.aluracursos.screenmatch.modelos;

public class Serie extends Title{
    int temps;
    int episodesPerSeason;
    int minutesPerEpisode;

    public Serie(String name, int releaseDate) {
        super(name, releaseDate);
    }

    @Override
    public int getDurationInMinutes() {
        return temps * episodesPerSeason * minutesPerEpisode;
    }

    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public String toString() {
        return "Serie: "+ this.getName()+ " ( "+ this.getReleaseDate()+ " )";
    }
}
