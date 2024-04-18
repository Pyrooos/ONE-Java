package com.aluracursos.screenmatch.calculations;

import com.aluracursos.screenmatch.modelos.Movie;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void included(Title title){
       this.totalTime += title.getDurationInMinutes();
    }
}
