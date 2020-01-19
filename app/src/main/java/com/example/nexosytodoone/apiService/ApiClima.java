package com.example.nexosytodoone.apiService;

import android.util.Log;

import com.example.nexosytodoone.activities.*;
import com.example.nexosytodoone.models.*;
import com.example.nexosytodoone.utils.Constants;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/***
 *   Desarrollado por el ingeniero Andrés Eduardo Cárdenas Jaramillo del 14 de diciembre la 16 de diciembre del 2019.
 */
public class ApiClima {
    private String BASE_URL = Constants.BASE_URL;                    // Contiene el main link de la ruta para hacer la consulta.
    private ApiInterfaceServices apiInterface;                      // Implementa la interfaz que sura retrofit para realizar el REST.
    private Clima weather;                         // Objeto lista de asteroides.

    /***
     *     Se encarga de configurar todo los parámetros necesarios para que la librería los utilice según la configuración.
     *     /// Andres
     */
    public ApiClima(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        this.apiInterface = retrofit.create(ApiInterfaceServices.class);

    }

    public void getApiClima(MainActivity context, String latitude, String longitude){

        getClimaApi(context, latitude, longitude);
    }

    private void getClimaApi(final MainActivity context,  String latitude, String longitude){
        String apikey = "403ae1a379a3fa52457165ce8522afb2";
        Call<Clima> call = this.apiInterface.getClima2(latitude, longitude, apikey );
        call.enqueue(new Callback<Clima>() {
            @Override
            public void onResponse(Call<Clima> call, Response<Clima> response) {
                if(!response.isSuccessful()){
                    Log.e("API2", String.valueOf(response.code()));
                    weather = null;
                    return;
                }
                Log.e("API2", String.valueOf(response.body().getName()));
                weather = response.body();
                String ciudad = weather.getName();

                double temperatura = weather.getMain().getTemp();
                NumberFormat nf = new DecimalFormat("##.###");


                String temp = nf.format(temperatura);
                String humedad = String.valueOf(weather.getMain().getHumidity());
                String tipoClima = weather.getWeathers().get(0).getMain();
                String pression = String.valueOf(weather.getMain().getPressure()) ;
                String estado = weather.getWeathers().get(0).getDescription();
                context.ponerConsulta(ciudad, temp, humedad, tipoClima, pression, estado);
            }

            @Override
            public void onFailure(Call<Clima> call, Throwable t) {
                Log.e("API2", String.valueOf(t.getMessage()));

            }
        });



    }

}
