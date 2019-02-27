package com.hfad.nbastats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class MainActivity extends AppCompatActivity
{
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchPredictions();
    }
    private void searchPredictions()
    {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://stats.nba.com/stats/allstarballotpredictor/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PredictionService service = retrofit.create(PredictionService.class);
        final Call<AllStarResponse> allStarResponseCall = service.searchByPlayers("LeBron James", "Kevin Durante",
                "Steph Curry", "James Harden", "Paul George", "Kyrie Irving", "Giannis Antetokounmpo",
                "Kawhi Leonard", "Joel Embiid", "Kemba Walker");
        allStarResponseCall.enqueue(new Callback<AllStarResponse>() {
            @Override
            public void onResponse(Call<AllStarResponse> call, Response<AllStarResponse> response)
            {
                Log.d("ENQUEUE", "onResponse: response" + (response == null));
                Log.d("ENQUEUE", "onResponse: response body" + (response.body() == null));

                List<AllStar> allstar = response.body().getResults();
                Log.d("ENQUEUE", "onResponse: " + allstar.toString());

            }

            @Override
            public void onFailure(Call<AllStarResponse> call, Throwable t)
            {
                Log.d("ENQUEUE", "onFailure" + t.getMessage());

            }
        });


    }
}
