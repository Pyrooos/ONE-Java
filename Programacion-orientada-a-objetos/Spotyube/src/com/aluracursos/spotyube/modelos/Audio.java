package com.aluracursos.spotyube.modelos;

public class Audio {

    private String title;
    private int totalNumberOfViews;
    private int duration;
    private int totalLikes;
    private int rating;

    public void like(){
        this.totalLikes ++;
    }
    public void views(){
        this.totalNumberOfViews ++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalNumberOfViews() {
        return totalNumberOfViews;
    }

    public void setTotalNumberOfViews(int totalNumberOfViews) {
        this.totalNumberOfViews = totalNumberOfViews;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public void setTotalLikes(int totalLikes) {
        this.totalLikes = totalLikes;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
