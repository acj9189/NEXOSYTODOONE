package com.example.nexosytodoone.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.nexosytodoone.R;
import com.example.nexosytodoone.apiService.ApiClima;

public class MainActivity extends AppCompatActivity {

    private ApiClima api;
    private double latitude = 35;;
    private double longitude = 139;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Prueba
        this.api = new ApiClima();
        String location = latitude + "," + longitude;
        Log.e("Error 1 ", Double.toString(latitude).trim());
        this.api.getClimaApi(MainActivity.this, Double.toString(latitude).trim(), Double.toString(longitude).trim() );
    }
}
