package com.segunfamisa.kotlin.samples.retrofit.data.java;


import com.segunfamisa.kotlin.samples.retrofit.data.kotlin.Result;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GithubApiServiceJava {

    @GET("search/users")
    Observable<Result> search(@Query("q") String query, @Query("page") int page, @Query("per_page") int perPage);

    /**
     * Factory method for convenient creation of the Api Service interface
     */
    class Factory {

        public static GithubApiServiceJava create() {
            Retrofit retrofit = new Retrofit.Builder()
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("https://api.github.com/")
                    .build();

            return retrofit.create(GithubApiServiceJava.class);
        }
    }
}
