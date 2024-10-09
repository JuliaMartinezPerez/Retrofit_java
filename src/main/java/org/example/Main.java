package org.example;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
//    public Main() throws IOException {
//    }

    public static void main(String[] args) throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.github.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GitHub github = retrofit.create(GitHub.class);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nom de l'usuari de github:");
        String nom =scanner.next();


        Call<List<Repositori>> call = github.repos(nom);
        List<Repositori> repos = call.execute().body();

        for (Repositori repo : repos) {
            System.out.println("\nNom repositori: " + repo.name);
            if(repo.description != null) {
                System.out.println("Descripció: " + repo.description);
            }
            System.out.println("Stargazers: " + repo.stargazers_count);
        }
    }
}

