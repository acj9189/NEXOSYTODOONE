package com.example.nexosytodoone.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.nexosytodoone.R;
import com.example.nexosytodoone.apiService.ApiClima;
import com.example.nexosytodoone.db.ManageSQLiteDB;
import com.example.nexosytodoone.utils.NaviUtilities;
import com.iammert.library.readablebottombar.ReadableBottomBar;

import java.util.LinkedList;
import java.util.List;


public class ExplicitApiactivity extends AppCompatActivity {

    private Button btnConsultarExplicit;
    private TextView textViewTempPE;
    private TextView textViewCXityLocationE;

    private EditText editTextLat;
    private EditText editTextLon;
    private ReadableBottomBar bottomBar;

    private ApiClima apiClima;

    private NaviUtilities util;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_api);
        setTitle(R.string.title);

        apiClima = new ApiClima();
        util = new NaviUtilities();

        textViewCXityLocationE = (TextView) findViewById(R.id.textViewCXityLocationE);
        textViewTempPE = (TextView) findViewById(R.id.textViewTempPE);
        editTextLat = (EditText) findViewById(R.id.editTextLat);
        editTextLon = (EditText) findViewById(R.id.editTextLon);

        btnConsultarExplicit = (Button)findViewById(R.id.btnConsultarExplicit);

        btnConsultarExplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String latitude = editTextLat.getText().toString();
                String longitude = editTextLon.getText().toString();
                realizarConsulta(latitude, longitude);

            }
        });

        bottomBar = (ReadableBottomBar) findViewById(R.id.ReadableBottomBar2);
        bottomBar.setOnItemSelectListener(new ReadableBottomBar.ItemSelectListener() {
            @Override
            public void onItemSelected(int i) {
                switch (i){
                    case 0:
                        util.callActivity(ExplicitApiactivity.this, MainActivity.class);
                        break;
                    case 1:
                        break;
                }
            }
        });

    }

    private void realizarConsulta(String lat, String lon){
        apiClima.getApiClimaEx(ExplicitApiactivity.this, lat, lon);
        util.sentMessageToUserCustomToast(ExplicitApiactivity.this, "Espere hasta que los elementos se carguen.");



    }

    public void asignarInfoCOnsulta(String temp, String ubicacion){
        textViewCXityLocationE.setText(ubicacion);
        textViewTempPE.setText(temp);

    }


}
