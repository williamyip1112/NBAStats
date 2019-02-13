package com.hfad.nbastats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchStats();
    }
    private void searchStats()
    {
        Retrofit retrofit = new Retrofit.Builder().baseUrl()

    }
}
