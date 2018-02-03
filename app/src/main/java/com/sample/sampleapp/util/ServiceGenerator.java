package com.sample.sampleapp.util;

import com.sample.sampleapp.BuildConfig;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Sahan Thinusha on 2/3/2018.
 */

public class ServiceGenerator {
    private static String apiBaseUrl = BuildConfig.API_URL;
    private static Retrofit retrofit;


    public static Retrofit getClient() {
        if (retrofit == null) {
            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
            retrofit = new Retrofit.Builder()
                    .baseUrl(apiBaseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build())
                    .build();
        }
        return retrofit;
    }


}
