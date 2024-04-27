import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Search {

    Search genericSearch(String TypeSearch) {
        String url = "https://cars-by-api-ninjas.p.rapidapi.com/v1/cars?" + TypeSearch.replace(" ", "_");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("X-RapidAPI-Key", "6856922e91msh36a2f47eabde3f7p110263jsnbd5979eecd1c")
                .header("X-RapidAPI-Host", "cars-by-api-ninjas.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = null;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);

        }
        return new Gson().fromJson(response.body(), Search.class);
    }
}