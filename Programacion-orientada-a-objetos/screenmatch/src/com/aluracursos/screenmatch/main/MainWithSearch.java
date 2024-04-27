package com.aluracursos.screenmatch.main;

import com.aluracursos.screenmatch.exception.ConversionErrorInDurationException;
import com.aluracursos.screenmatch.modelos.Title;
import com.aluracursos.screenmatch.modelos.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        List<Title> titles = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (true){
            System.out.println("Write the name of the movie do you want");
            var search = scanner.nextLine();
            if (search.equalsIgnoreCase("exit")){
                break;
            }
            String url = "https://www.omdbapi.com/?t=" + search.replace(" ", "+")+"&apikey=d4dbcc70";

            try{
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                System.out.println(json);
                TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);

                System.out.println(myTitleOmdb);

                Title myTitle = new Title(myTitleOmdb);
                System.out.println(myTitle);
                titles.add(myTitle);
            }catch (NumberFormatException e ){
                System.out.println("An error has occurred");
                System.out.println(e.getMessage());
            }catch (IllegalArgumentException e){
                System.out.println("Error in the uri, please verify the address");
            }catch (ConversionErrorInDurationException e){
                System.out.println(e.getMessage());

            }
        }
        System.out.println(titles);
        FileWriter reading = new FileWriter("Titles.json");
        reading.write(gson.toJson(titles));
        reading.close();
        System.out.println("Program execution finished");
    }
}
