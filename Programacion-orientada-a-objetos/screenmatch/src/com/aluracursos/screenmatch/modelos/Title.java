package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.exception.ConversionErrorInDurationException;
import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title>{

    private String name;

    private int durationInMinutes;

    private int releaseDate;
    private boolean includedInThePlan;

    private double sumOfEvaluations;
    private int totalEvaluations;

    public Title(String name, int releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
    }

    public Title(TitleOmdb myTitleOmdb) {
        this.name = myTitleOmdb.title();
        this.releaseDate = Integer.valueOf(myTitleOmdb.year());
        if(myTitleOmdb.runtime().contains("N/A")){
            throw new ConversionErrorInDurationException("It's not possible to convert because it doesn't contain data");
        }
        this.durationInMinutes = Integer.valueOf(myTitleOmdb.runtime().substring(0,3).replace(" ","" ));
    }

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

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }

    @Override
    public String toString() {
        return "(Name=" + name +
                ", Release Date =" + releaseDate +
                ", Duration= " + durationInMinutes+")";


    }
}
