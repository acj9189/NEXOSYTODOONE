package com.example.nexosytodoone.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataDaily {

    @SerializedName("time")
    @Expose
       private long time;

    @SerializedName("summary")
    @Expose
       private String summary;

    @SerializedName("icon")
    @Expose
       private String icon;

    @SerializedName("sunriseTime")
    @Expose
       private long sunriseTime;

    @SerializedName("sunsetTime")
    @Expose
       private long sunsetTime;

    @SerializedName("moonPhase")
    @Expose
       private double moonPhase;

    @SerializedName("precipIntensity")
    @Expose
       private double precipIntensity;

    @SerializedName("precipIntensityMax")
    @Expose
       private double precipIntensityMax;

    @SerializedName("precipIntensityMaxTime")
    @Expose
       private long precipIntensityMaxTime;

    @SerializedName("precipProbability")
    @Expose
       private double precipProbability;

    @SerializedName("precipType")
    @Expose
       private String precipType;

    @SerializedName("temperatureHigh")
    @Expose
       private double temperatureHigh;

    @SerializedName("temperatureHighTime")
    @Expose
       private long temperatureHighTime;

    @SerializedName("temperatureLow")
    @Expose
       private double temperatureLow;

    @SerializedName("temperatureLowTime")
    @Expose
       private long temperatureLowTime;

    @SerializedName("apparentTemperatureHigh")
    @Expose
       private double apparentTemperatureHigh;

    @SerializedName("apparentTemperatureLow")
    @Expose
       private double apparentTemperatureLow;

    @SerializedName("apparentTemperatureLowTime")
    @Expose
       private long apparentTemperatureLowTime;

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

    @SerializedName("windGust")
    @Expose
       private double windGust;

    @SerializedName("windGustTime")
    @Expose
       private long windGustTime;

    @SerializedName("windBearing")
    @Expose
       private long windBearing;

    @SerializedName("cloudCover")
    @Expose
       private double cloudCover;

    @SerializedName("uvIndex")
    @Expose
       private long uvIndex;

    @SerializedName("uvIndexTime")
    @Expose
       private long uvIndexTime;

    @SerializedName("visibility")
    @Expose
       private double visibility;

    @SerializedName("ozone")
    @Expose
       private double ozone;


    public DataDaily() {
    }

    public DataDaily(long time, String summary, String icon, long sunriseTime, long sunsetTime, double moonPhase, double precipIntensity, double precipIntensityMax, long precipIntensityMaxTime, double precipProbability, String precipType, double temperatureHigh, long temperatureHighTime, double temperatureLow, long temperatureLowTime, double apparentTemperatureHigh, double apparentTemperatureLow, long apparentTemperatureLowTime, double dewPoint, double humidity, double pressure, double windSpeed, double windGust, long windGustTime, long windBearing, double cloudCover, long uvIndex, long uvIndexTime, double visibility, double ozone) {
        this.time = time;
        this.summary = summary;
        this.icon = icon;
        this.sunriseTime = sunriseTime;
        this.sunsetTime = sunsetTime;
        this.moonPhase = moonPhase;
        this.precipIntensity = precipIntensity;
        this.precipIntensityMax = precipIntensityMax;
        this.precipIntensityMaxTime = precipIntensityMaxTime;
        this.precipProbability = precipProbability;
        this.precipType = precipType;
        this.temperatureHigh = temperatureHigh;
        this.temperatureHighTime = temperatureHighTime;
        this.temperatureLow = temperatureLow;
        this.temperatureLowTime = temperatureLowTime;
        this.apparentTemperatureHigh = apparentTemperatureHigh;
        this.apparentTemperatureLow = apparentTemperatureLow;
        this.apparentTemperatureLowTime = apparentTemperatureLowTime;
        this.dewPoint = dewPoint;
        this.humidity = humidity;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
        this.windGust = windGust;
        this.windGustTime = windGustTime;
        this.windBearing = windBearing;
        this.cloudCover = cloudCover;
        this.uvIndex = uvIndex;
        this.uvIndexTime = uvIndexTime;
        this.visibility = visibility;
        this.ozone = ozone;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
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

    public long getSunriseTime() {
        return sunriseTime;
    }

    public void setSunriseTime(long sunriseTime) {
        this.sunriseTime = sunriseTime;
    }

    public long getSunsetTime() {
        return sunsetTime;
    }

    public void setSunsetTime(long sunsetTime) {
        this.sunsetTime = sunsetTime;
    }

    public double getMoonPhase() {
        return moonPhase;
    }

    public void setMoonPhase(double moonPhase) {
        this.moonPhase = moonPhase;
    }

    public double getPrecipIntensity() {
        return precipIntensity;
    }

    public void setPrecipIntensity(double precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public double getPrecipIntensityMax() {
        return precipIntensityMax;
    }

    public void setPrecipIntensityMax(double precipIntensityMax) {
        this.precipIntensityMax = precipIntensityMax;
    }

    public long getPrecipIntensityMaxTime() {
        return precipIntensityMaxTime;
    }

    public void setPrecipIntensityMaxTime(long precipIntensityMaxTime) {
        this.precipIntensityMaxTime = precipIntensityMaxTime;
    }

    public double getPrecipProbability() {
        return precipProbability;
    }

    public void setPrecipProbability(double precipProbability) {
        this.precipProbability = precipProbability;
    }

    public String getPrecipType() {
        return precipType;
    }

    public void setPrecipType(String precipType) {
        this.precipType = precipType;
    }

    public double getTemperatureHigh() {
        return temperatureHigh;
    }

    public void setTemperatureHigh(double temperatureHigh) {
        this.temperatureHigh = temperatureHigh;
    }

    public long getTemperatureHighTime() {
        return temperatureHighTime;
    }

    public void setTemperatureHighTime(long temperatureHighTime) {
        this.temperatureHighTime = temperatureHighTime;
    }

    public double getTemperatureLow() {
        return temperatureLow;
    }

    public void setTemperatureLow(double temperatureLow) {
        this.temperatureLow = temperatureLow;
    }

    public long getTemperatureLowTime() {
        return temperatureLowTime;
    }

    public void setTemperatureLowTime(long temperatureLowTime) {
        this.temperatureLowTime = temperatureLowTime;
    }

    public double getApparentTemperatureHigh() {
        return apparentTemperatureHigh;
    }

    public void setApparentTemperatureHigh(double apparentTemperatureHigh) {
        this.apparentTemperatureHigh = apparentTemperatureHigh;
    }

    public double getApparentTemperatureLow() {
        return apparentTemperatureLow;
    }

    public void setApparentTemperatureLow(double apparentTemperatureLow) {
        this.apparentTemperatureLow = apparentTemperatureLow;
    }

    public long getApparentTemperatureLowTime() {
        return apparentTemperatureLowTime;
    }

    public void setApparentTemperatureLowTime(long apparentTemperatureLowTime) {
        this.apparentTemperatureLowTime = apparentTemperatureLowTime;
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

    public double getWindGust() {
        return windGust;
    }

    public void setWindGust(double windGust) {
        this.windGust = windGust;
    }

    public long getWindGustTime() {
        return windGustTime;
    }

    public void setWindGustTime(long windGustTime) {
        this.windGustTime = windGustTime;
    }

    public long getWindBearing() {
        return windBearing;
    }

    public void setWindBearing(long windBearing) {
        this.windBearing = windBearing;
    }

    public double getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(double cloudCover) {
        this.cloudCover = cloudCover;
    }

    public long getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(long uvIndex) {
        this.uvIndex = uvIndex;
    }

    public long getUvIndexTime() {
        return uvIndexTime;
    }

    public void setUvIndexTime(long uvIndexTime) {
        this.uvIndexTime = uvIndexTime;
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
