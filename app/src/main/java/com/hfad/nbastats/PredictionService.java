package com.hfad.nbastats;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

interface PredictionService
{
    @GET("api/")
    @Headers({"Accept: application/json"})
    Call<AllStarResponse> searchByPlayers(@Query("i") String player);
}
