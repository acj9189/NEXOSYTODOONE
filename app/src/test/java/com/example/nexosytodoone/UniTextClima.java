package com.example.nexosytodoone;

import android.app.Activity;

import com.example.nexosytodoone.activities.MainActivity;
import com.example.nexosytodoone.apiService.ApiClima;
import com.example.nexosytodoone.models.Clima;
import com.example.nexosytodoone.models.Weather;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class UniTextClima {

    ApiClima apiClima;
    @Before
    public void setUp() throws Exception {
        apiClima = new ApiClima();

    }

    @Test
    public void ClimaEqual(){

        String latitude = String.valueOf(139);
        String longitude = String.valueOf(35);
        apiClima.getApiClima(new MainActivity(), latitude , longitude );
        String nameC = apiClima.getWeather().getName();
        assertEquals( nameC, "Shuzenji");
    }

    @Test
    public void ClimaNoEqual(){
        String latitude = String.valueOf(139);
        String longitude = String.valueOf(-35);
        apiClima.getApiClima(new MainActivity(), latitude , longitude );
        String nameC = apiClima.getWeather().getName();
        assertNotEquals( nameC, "Shuzenji");
    }

    @Test
    public void ClimaNoNull(){
        String latitude = String.valueOf(-139);
        String longitude = String.valueOf(-35);
        apiClima.getApiClima(new MainActivity(), latitude , longitude );
        Clima weather = apiClima.getWeather();
        assertNotNull(weather);
    }

    @Test
    public void ClimaNull(){
        String latitude = String.valueOf(-139);
        String longitude = String.valueOf(-35);
        apiClima.getApiClima(new MainActivity(), latitude , longitude );
        Clima weather = apiClima.getWeather();
        assertNull(weather);


    }




}
