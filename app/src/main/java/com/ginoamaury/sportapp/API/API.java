package com.ginoamaury.sportapp.API;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class API {
    private static IAPI api;
    private static final String URLROOT = "https://www.thesportsdb.com/api/v1/json/1/";

    public static IAPI getApi() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);

        if (api == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(URLROOT)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build())
                    .build();
            api = retrofit.create(IAPI.class);
        }

        return api;
    }
}
