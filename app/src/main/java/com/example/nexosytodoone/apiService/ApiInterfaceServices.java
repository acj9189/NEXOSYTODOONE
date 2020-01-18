package com.example.nexosytodoone.apiService;

import com.example.nexosytodoone.models.*;


import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/***
 *   Desarrollado por el ingeniero Andrés Eduardo Cárdenas Jaramillo del 14 de diciembre la 16 de diciembre del 2019.
 */
public interface ApiInterfaceServices {

    String apiKey = "";

    /***
     *        metodo que se encarga de hacer el llmado a retrofit  para la consulta en el api
     * @param latitude
     * @param longitude
     * @return
     */

    @GET("{latitude},{longitude}")
    Call<Weather> getClima(@Path("latitude") String latitude, @Path("longitude") String longitude );

    //https://api.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=403ae1a379a3fa52457165ce8522afb2

    @GET("weather")
    Call<Clima> getClima2(@Query("lat") String lat, @Query("lon") String longitude, @Query("appid") String appid );


}
