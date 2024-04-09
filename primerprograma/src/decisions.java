public class decisions {
    public static void main(String[] args) {

        int dateOfRelease = 1999;
        boolean memberActive = true;
        double ratingOfMovie = 8.2;
        String typeOfPlan = "Gold";

        if (dateOfRelease > 2024){
            System.out.println("Most popular movies");
        }else {
            System.out.println("Retro movies");
        }
        if (memberActive && typeOfPlan.equals("Platinum+")){
            System.out.println("Enjoy you movie");
        } else {
            System.out.println("Movie not included in your plan. \nDo you want to improve your plan? ");
        }
    }
}
