package com.example.nexosytodoone.utils;

import java.util.concurrent.atomic.AtomicInteger;

public class Constants {


    public static final AtomicInteger count = new AtomicInteger(0);
   // public static final String BASE_URL = "https://api.darksky.net/forecast/2b1d183a0c9adb98466a2562c4a28167/";
   public static final String BASE_URL = " https://api.openweathermap.org/data/2.5/";
    public static final String SHOPINGCAR_TABLE = "SHOPINGCAR";
    public static final String SHOPINGCAR_TABLE_FIELD_IDS = "idShopingCar";
    public static final String SHOPINGCAR_TABLE_FIELD_IDAS = "idAsteroid";


    public static final String CREATE_SHOPINGCAR_TABLE = "CREATE TABLE " + SHOPINGCAR_TABLE + " (" + SHOPINGCAR_TABLE_FIELD_IDS + " INTEGER , " + SHOPINGCAR_TABLE_FIELD_IDAS + " TEXT) ";
    public static final String DROP_SHOPINGCAR_TABLE = "DROP TABLE "+ SHOPINGCAR_TABLE;





}
