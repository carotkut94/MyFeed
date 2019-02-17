package com.death.myfeed.network;

import com.death.myfeed.network.services.FeedService;
import com.death.myfeed.utils.Constant;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitProvider {
    private static Retrofit retrofit = null;

    private static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(Constant.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static FeedService getRestApiService() {
        return getClient().create(FeedService.class);
    }
}
