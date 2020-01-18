package com.example.nexosytodoone.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrentlyWeather {

    @SerializedName("time")
    @Expose
    private long time;

    @SerializedName("summary")
    @Expose
    private String summary;

    @SerializedName("icon")
    @Expose
    private String icon;

    @SerializedName("nearestStormDistanc")
    @Expose
    private Long nearestStormDistance;

    @SerializedName("nearestStormBearing")
    @Expose
    private Long nearestStormBearing;

    @SerializedName("precipIntensity")
    @Expose
    private Long precipIntensity;

    @SerializedName("precipProbability")
    @Expose
    private Long precipProbability;

    @SerializedName("temperature")
    @Expose
    private double temperature;

    @SerializedName("apparentTemperature")
    @Expose
    private double apparentTemperature;

    @SerializedName("dewPoint")
    @Expose
    private double dewPoint;

    @SerializedName("humidity")
    @Expose
    private double humidity;

    @SerializedName("pressure")
    @Expose
    private double pressure;

    @SerializedName("windSpeed")
    @Expose
    private double windSpeed;

    @SerializedName("indGust")
    @Expose
    private double indGust;

    @SerializedName("windBearing")
    @Expose
    private double windBearing;

    @SerializedName("cloudCover")
    @Expose
    private double cloudCover;

    @SerializedName("uvIndex")
    @Expose
    private double uvIndex;

    @SerializedName("visibility")
    @Expose
    private double visibility;

    @SerializedName("ozone")
    @Expose
    private double ozone;

    public CurrentlyWeather() {
    }

    public CurrentlyWeather(long time, String summary, String icon, Long nearestStormDistance, Long nearestStormBearing, Long precipIntensity, Long precipProbability, double temperature, double apparentTemperature, double dewPoint, double humidity, double pressure, double windSpeed, double indGust, double windBearing, double cloudCover, double uvIndex, double visibility, double ozone) {
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

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Long getNearestStormDistance() {
        return nearestStormDistance;
    }

    public void setNearestStormDistance(Long nearestStormDistance) {
        this.nearestStormDistance = nearestStormDistance;
    }

    public Long getNearestStormBearing() {
        return nearestStormBearing;
    }

    public void setNearestStormBearing(Long nearestStormBearing) {
        this.nearestStormBearing = nearestStormBearing;
    }

    public Long getPrecipIntensity() {
        return precipIntensity;
    }

    public void setPrecipIntensity(Long precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public Long getPrecipProbability() {
        return precipProbability;
    }

    public void setPrecipProbability(Long precipProbability) {
        this.precipProbability = precipProbability;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getApparentTemperature() {
        return apparentTemperature;
    }

    public void setApparentTemperature(double apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    public double getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(double dewPoint) {
        this.dewPoint = dewPoint;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getIndGust() {
        return indGust;
    }

    public void setIndGust(double indGust) {
        this.indGust = indGust;
    }

    public double getWindBearing() {
        return windBearing;
    }

    public void setWindBearing(double windBearing) {
        this.windBearing = windBearing;
    }

    public double getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(double cloudCover) {
        this.cloudCover = cloudCover;
    }

    public double getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(double uvIndex) {
        this.uvIndex = uvIndex;
    }

    public double getVisibility() {
        return visibility;
    }

    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }

    public double getOzone() {
        return ozone;
    }

    public void setOzone(double ozone) {
        this.ozone = ozone;
    }
}
