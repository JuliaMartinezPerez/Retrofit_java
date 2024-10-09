package org.example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface GitHub{
    @GET("users/{user}/repos")
    Call<List<Repositori>> repos(@Path("user") String user);
}

//url: "http://api.github.com/users/{user}/repos"
