package com.hfad.nbastats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public class MainActivity extends AppCompatActivity
{
    @Headers({"Accept: application/json"})
    @POST("user/classes")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchPredictions();
    }
    private void searchPredictions()
    {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://stats.nba.com/stats/allstarballotpredictor")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PredictionService service = retrofit.create(PredictionService.class);
        Call<AllStarResponse> allStarResponseCall = service.searchByPlayers("LeBron James");
        allStarResponseCall.enqueue(new Callback<AllStarResponse>() {
            @Override
            public void onResponse(Call<AllStarResponse> call, Response<AllStarResponse> response)
            {

            }

            @Override
            public void onFailure(Call<AllStarResponse> call, Throwable t) {

            }
        });


    }
}
