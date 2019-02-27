package com.hfad.nbastats;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

interface PredictionService
{
    @GET("api/")
    @Headers({"Accept: application/json"})
    Call<AllStarResponse> searchByPlayers(@Query("a") String wplayer1, @Query("b") String wplayer2, @Query("c") String wplayer3, @Query("d") String wplayer4
                            , @Query("e") String wplayer5, @Query("f") String eplayer1, @Query("g") String eplayer2, @Query("h") String eplayer3,
                                          @Query("i") String eplayer4, @Query("j") String eplayer5);

}
