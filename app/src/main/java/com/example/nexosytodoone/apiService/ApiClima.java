package com.example.nexosytodoone.apiService;

import android.util.Log;

import com.example.nexosytodoone.activities.*;
import com.example.nexosytodoone.models.*;
import com.example.nexosytodoone.utils.Constants;

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
    private Weather weather;                         // Objeto lista de asteroides.

    /***
     *     Se encarga de configurar todo los parámetros necesarios para que la librería los utilice según la configuración.
     *     /// Andres
     */
    public ApiClima(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
               // .addConverterFactory(new NullOnEmptyConverterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        this.apiInterface = retrofit.create(ApiInterfaceServices.class);

    }

    public void getApiClima(MainActivity context, String latitude, String longitude){

        getApiClimap(context, latitude, longitude);
    }

    /***
     *
     * @param context
     * @param latitude
     * @param longitude
     */
    private void getApiClimap(final MainActivity context,  String latitude, String longitude){
        Call<Weather> call = this.apiInterface.getClima(latitude, longitude );

        call.enqueue(new Callback<Weather>() {
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response) {
                Log.e("AAAAA", String.valueOf(response.body().getLatitud()));
                if(!response.isSuccessful() && response.body() != null ){
                    weather = null;
                    Log.e("informacion ","LA INPOTRAIDA ES NULA" + response.message());
                    return;
                }

                Log.e("Informacion", "Entre por aqui");
                weather = (Weather) response.body();
                //Falta que hacer
                Log.e("Informacion2", weather.getLatitud() + " TRAJO LA INFO CORRERCTAMANTE " + response.errorBody() );

            }

            @Override
            public void onFailure(Call<Weather> call, Throwable t) {
                Log.e("Error onFailure", t.getMessage().toString());

            }
        });

    }

    public  void getClimaApi(final MainActivity context,  String latitude, String longitude){
        String apikey = "403ae1a379a3fa52457165ce8522afb2";
        Call<Clima> call = this.apiInterface.getClima2(latitude, longitude, apikey );
        call.enqueue(new Callback<Clima>() {
            @Override
            public void onResponse(Call<Clima> call, Response<Clima> response) {
                if(!response.isSuccessful()){
                    Log.e("API2", String.valueOf(response.code()));
                    return;
                }
                Log.e("API2", String.valueOf(response.body().getName()));
            }

            @Override
            public void onFailure(Call<Clima> call, Throwable t) {
                Log.e("API2", String.valueOf(t.getMessage()));

            }
        });



    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }
}
