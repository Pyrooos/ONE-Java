import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public record SearchVehicleManufacturer() {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        while (true){
            System.out.println("Write the Vehicle nanufacturer name of the car you want information about");
            var searchVehicleManufacturer = keyboard.nextLine();

            if(searchVehicleManufacturer.toLowerCase().equalsIgnoreCase("exit")){
                System.out.println("Program finished");
                break;
            }


            String url = "https://cars-by-api-ninjas.p.rapidapi.com/v1/cars?make=" + searchVehicleManufacturer.replace(" ", "+");
            try {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .header("X-RapidAPI-Key", "6856922e91msh36a2f47eabde3f7p110263jsnbd5979eecd1c")
                        .header("X-RapidAPI-Host", "cars-by-api-ninjas.p.rapidapi.com")
                        .method("GET", HttpRequest.BodyPublishers.noBody())
                        .build();
                HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

            } catch (NumberFormatException e) {
                System.out.println("An error has occurred");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error in the uri, please verify the address");
            }

        }
    }
}
