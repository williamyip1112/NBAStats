package com.hfad.nbastats;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface PredictionService
{
    @GET("api/")
    Call<AllStarResponse> searchByPlayers(@Query("i") String player);
}
