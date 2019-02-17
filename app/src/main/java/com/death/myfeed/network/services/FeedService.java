package com.death.myfeed.network.services;

import com.death.myfeed.model.dto.FeedResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FeedService {

    @GET("dummy")
    Call<List<FeedResponse>> getAllFeed();

}
