package com.example.techmarket.network;

import com.example.techmarket.ui.InterestingPhotosActivity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


    public interface FlickrApi {
        @GET("services/rest?method=flickr.interestingness.getList")

        Call<InterestingPhotosActivity> getPhotos(
                @Query("api_key") String api_key,
                @Query("format") String format,
                @Query("extras") String url_h
        );
    }

