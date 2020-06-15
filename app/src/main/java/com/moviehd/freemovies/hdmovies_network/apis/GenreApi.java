package com.moviehd.freemovies.hdmovies_network.apis;

import com.moviehd.freemovies.hdmovies_models.home_content.AllGenre;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface GenreApi {

    @GET("all_genre")
    Call<List<AllGenre>> getGenre(@Header("API-KEY") String apiKey);


}
