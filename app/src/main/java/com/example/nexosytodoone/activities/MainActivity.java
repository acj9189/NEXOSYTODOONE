package com.example.nexosytodoone.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nexosytodoone.R;
import com.example.nexosytodoone.apiService.ApiClima;
import com.example.nexosytodoone.utils.NaviUtilities;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ApiClima api;
    private double latitude = 35;;
    private double longitude = 139;

    private double latitudet = 35;;
    private double longitudet = 139;
    private FusedLocationProviderClient fusedLocationClient;

    private Button btnConsultar;
    private TextView textViewCXityLocation;
    private TextView textViewTempP;
    private TextView textViewHumedadI;
    private TextView textViewClimaI;
    private TextView textViewPresionI;
    private ImageView imgViewClima;

    private NaviUtilities util;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(R.string.title);

        util = new NaviUtilities();

        //Prueba API
        this.api = new ApiClima();

        if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 0);
           // util.sentMessageToUserCustomToast(MainActivity.this, "Se garantizo el permiso de uso de la ubicación");
        }
        realizarConsulta();


        btnConsultar = (Button)findViewById(R.id.btn);
        btnConsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                util.sentMessageToUserCustomToast(MainActivity.this, "Si su Locación no ha cambiado, la consulta continuará igual.");
                realizarConsulta();
            }
        });

        textViewCXityLocation = (TextView) findViewById(R.id.textViewCXityLocation);
        textViewTempP = (TextView) findViewById(R.id.textViewTempP);
        textViewHumedadI = (TextView) findViewById(R.id.textViewHumedadI);
        textViewClimaI = (TextView) findViewById(R.id.textViewClimaI);
        textViewPresionI = (TextView) findViewById(R.id.textViewPresionI);
        imgViewClima = (ImageView) findViewById(R.id.imgViewClima);

    }

    private void realizarConsulta(){
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        fusedLocationClient.getLastLocation().addOnSuccessListener(this, new OnSuccessListener<Location>() {
            @Override
            public void onSuccess(Location location) {
                if (location != null){
                    latitude = location.getLatitude();
                    longitude = location.getLongitude();
                    Log.e("La", Double.toString(latitude));
                    Log.e("Lon", Double.toString(longitude));
                    api.getApiClima(MainActivity.this, Double.toString(latitude).trim(), Double.toString(longitude).trim() );
                }
            }
        });
    }

    public void ponerConsulta(String ciudad, String temperatura, String humedad, String tipoClima, String presion, String estado ){
        textViewCXityLocation.setText(ciudad);
        textViewTempP.setText(temperatura + " " + R.string.tempI);
        textViewHumedadI.setText(humedad);
        textViewClimaI.setText(tipoClima);
        textViewPresionI.setText(presion);

        switch (estado){
            case "Clear":
                Picasso.get().load(R.drawable.sunny).into(imgViewClima);
                break;

            case "Extreme":
                Picasso.get().load(R.drawable.electricstorm).into(imgViewClima);
                break;

            case "Rain":
                Picasso.get().load(R.drawable.raining).into(imgViewClima);
                break;

            case "Clouds":
                Picasso.get().load(R.drawable.cloudy).into(imgViewClima);
                break;

            case "Snow":
                Picasso.get().load(R.drawable.thunders).into(imgViewClima);
                break;
        }


    }



}
