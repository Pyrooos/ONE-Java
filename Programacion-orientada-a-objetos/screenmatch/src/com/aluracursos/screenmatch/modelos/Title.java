package com.aluracursos.screenmatch.modelos;

public class Title {
    private String name;
    private int durationInMinutes;
    private int releaseDate;
    private boolean includedInThePlan;

    private double sumOfEvaluations;
    private int totalEvaluations;

    public String getName() {
        return name;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public boolean isIncludedInThePlan() {
        return includedInThePlan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDurationInMinutes(int duration) {
        this.durationInMinutes = duration;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public int getTotalEvaluations(){
        return totalEvaluations;
    }
    public void showTechnicalSpecifications(){
        System.out.println("The name of the movie is: "+ name);
        System.out.println("Your release date was: " + releaseDate);
        System.out.println("Duration in minutes " + getDurationInMinutes());
    }

    public void evaluate(double note){
        sumOfEvaluations += note;
        totalEvaluations++;
    }

    public double calculateMedia(){
        return sumOfEvaluations /totalEvaluations;
    }
}
