package com.example.nexosytodoone.utils;

import java.util.concurrent.atomic.AtomicInteger;

public class Constants {


    public static final AtomicInteger count = new AtomicInteger(0);
   // public static final String BASE_URL = "https://api.darksky.net/forecast/2b1d183a0c9adb98466a2562c4a28167/";
   public static final String BASE_URL = " https://api.openweathermap.org/data/2.5/";
   public static final String WEATHER_TABLE = "WEATHER";
   public static final String WEATHER_TABLE_FIELD_IDS = "idWEATHER";
   public static final String WEATHER_TABLE_FIELD_CITY = "nameCITYWEATHER";
   public static final String WEATHER_TABLE_FIELD_TEMPERATURE = "temperatureWEATHER";



   public static final String CREATE_WEATHER_TABLE = "CREATE TABLE " + WEATHER_TABLE + " (" + WEATHER_TABLE_FIELD_IDS + " INTEGER , " + WEATHER_TABLE_FIELD_CITY + " TEXT, " + WEATHER_TABLE_FIELD_TEMPERATURE + " TEXT) ";
   public static final String DROP_WEATHER_TABLE = "DROP TABLE "+ WEATHER_TABLE;










}


