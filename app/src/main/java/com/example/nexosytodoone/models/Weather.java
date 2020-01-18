package com.example.nexosytodoone.models;

public class Weather {

    private double latitud;
    private double longitude;
    private String timeZone;
    private RealTimeWeather currently;
    private MinutelyWeather minutely;
    private HourlyWeather hourly;
    private DailyWeather daily;
    private Flags flags;
    private double offset;

    public Weather() {
    }

    public Weather(double latitud, double longitude, String timeZone, RealTimeWeather currently, MinutelyWeather minutely, HourlyWeather hourly, DailyWeather daily, Flags flags, double offset) {
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

    public RealTimeWeather getCurrently() {
        return currently;
    }

    public void setCurrently(RealTimeWeather currently) {
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

    public void setOffset(double offset) {
        this.offset = offset;
    }
}
