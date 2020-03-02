package com.gauri.userlist;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

/**
 * Created by anupamchugh on 09/01/17.
 */

interface APIInterface {

    @GET("/api/unknown")
    Call<MultipleResource> doGetListResources();

}