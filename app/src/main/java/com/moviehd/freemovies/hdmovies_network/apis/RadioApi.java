package com.moviehd.freemovies.hdmovies_network.apis;

import com.moviehd.freemovies.hdmovies_network.model.RadioModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface RadioApi {

    @GET("featured_radio")
    Call<List<RadioModel>> getAllRadioByCategory(@Header("API-KEY") String apiKey);
}
