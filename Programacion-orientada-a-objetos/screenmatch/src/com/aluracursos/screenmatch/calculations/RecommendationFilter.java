package com.aluracursos.screenmatch.calculations;

public class RecommendationFilter {
   public  void filter(Rating rating){
        if (rating. getRating()>=4){
            System.out.println("Right now this content is  being evaluated very well ");
        } else if (rating.getRating() >=2 ) {
            System.out.println("At this moment, it's popular");
        }else {
            System.out.println("Save it for watching later");
        }

    }
}
