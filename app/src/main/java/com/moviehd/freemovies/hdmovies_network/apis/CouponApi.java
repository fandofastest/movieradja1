package com.moviehd.freemovies.hdmovies_network.apis;

import com.moviehd.freemovies.hdmovies_network.model.CouponDetails;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CouponApi {
    @GET("coupon_details")
    Call<CouponDetails> getCouponDetails(@Query("api_secret_key") String key,
                                         @Query("coupon_code") String couponCode);

}
