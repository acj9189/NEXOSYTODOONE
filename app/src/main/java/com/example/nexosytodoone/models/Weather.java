package com.example.nexosytodoone.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Weather {

    @SerializedName("latitud")
    @Expose
    private double latitud;

    @SerializedName("longitude")
    @Expose
    private double longitude;

    @SerializedName("timeZone")
    @Expose
    private String timeZone;

    @SerializedName("currently")
    @Expose
    private CurrentlyWeather currently;

    @SerializedName("minutely")
    @Expose
    private MinutelyWeather minutely;

    @SerializedName("hourly")
    @Expose
    private HourlyWeather hourly;

    @SerializedName("daily")
    @Expose
    private DailyWeather daily;

    @SerializedName("flags")
    @Expose
    private Flags flags;

    @SerializedName("offset")
    @Expose
    private Integer offset;

    public Weather() {
    }

    public Weather(double latitud, double longitude, String timeZone, CurrentlyWeather currently, MinutelyWeather minutely, HourlyWeather hourly, DailyWeather daily, Flags flags, Integer offset) {
        this.latitud = latitud;
        this.longitude = longitude;
        this.timeZone = timeZone;
        this.currently = currently;
        this.minutely = minutely;
        this.hourly = hourly;
        this.daily = daily;
        this.flags = flags;
        this.offset = offset;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public CurrentlyWeather getCurrently() {
        return currently;
    }

    public void setCurrently(CurrentlyWeather currently) {
        this.currently = currently;
    }

    public MinutelyWeather getMinutely() {
        return minutely;
    }

    public void setMinutely(MinutelyWeather minutely) {
        this.minutely = minutely;
    }

    public HourlyWeather getHourly() {
        return hourly;
    }

    public void setHourly(HourlyWeather hourly) {
        this.hourly = hourly;
    }

    public DailyWeather getDaily() {
        return daily;
    }

    public void setDaily(DailyWeather daily) {
        this.daily = daily;
    }

    public Flags getFlags() {
        return flags;
    }

    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    public double getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}
