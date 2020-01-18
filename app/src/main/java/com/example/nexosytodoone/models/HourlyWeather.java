package com.example.nexosytodoone.models;

public class HourlyWeather {

    private long time;
    private String summary;
    private String icon;
    private Long nearestStormDistance;
    private Long nearestStormBearing;
    private Long precipIntensity;
    private Long precipProbability;
    private double temperature;
    private double apparentTemperature;
    private double dewPoint;
    private double humidity;
    private double pressure;
    private double windSpeed;
    private double indGust;
    private double windBearing;
    private double cloudCover;
    private double uvIndex;
    private double visibility;
    private Long ozone;

    public HourlyWeather() {
    }

    public HourlyWeather(long time, String summary, String icon, Long nearestStormDistance, Long nearestStormBearing, Long precipIntensity, Long precipProbability, double temperature, double apparentTemperature, double dewPoint, double humidity, double pressure, double windSpeed, double indGust, double windBearing, double cloudCover, double uvIndex, double visibility, Long ozone) {
        this.time = time;
        this.summary = summary;
        this.icon = icon;
        this.nearestStormDistance = nearestStormDistance;
        this.nearestStormBearing = nearestStormBearing;
        this.precipIntensity = precipIntensity;
        this.precipProbability = precipProbability;
        this.temperature = temperature;
        this.apparentTemperature = apparentTemperature;
        this.dewPoint = dewPoint;
        this.humidity = humidity;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
        this.indGust = indGust;
        this.windBearing = windBearing;
        this.cloudCover = cloudCover;
        this.uvIndex = uvIndex;
        this.visibility = visibility;
        this.ozone = ozone;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setNearestStormDistance(Long nearestStormDistance) {
        this.nearestStormDistance = nearestStormDistance;
    }

    public void setNearestStormBearing(Long nearestStormBearing) {
        this.nearestStormBearing = nearestStormBearing;
    }

    public void setPrecipIntensity(Long precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public void setPrecipProbability(Long precipProbability) {
        this.precipProbability = precipProbability;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setApparentTemperature(double apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    public void setDewPoint(double dewPoint) {
        this.dewPoint = dewPoint;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setIndGust(double indGust) {
        this.indGust = indGust;
    }

    public void setWindBearing(double windBearing) {
        this.windBearing = windBearing;
    }

    public void setCloudCover(double cloudCover) {
        this.cloudCover = cloudCover;
    }

    public void setUvIndex(double uvIndex) {
        this.uvIndex = uvIndex;
    }

    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }

    public void setOzone(Long ozone) {
        this.ozone = ozone;
    }
}
