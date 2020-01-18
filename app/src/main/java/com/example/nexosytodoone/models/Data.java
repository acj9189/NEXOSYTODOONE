package com.example.nexosytodoone.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("time")
    @Expose
    private long time;

    @SerializedName("precipIntensity")
    @Expose
    private double precipIntensity;

    @SerializedName("precipProbability")
    @Expose
    private double precipProbability;

    public Data() {
    }

    public Data(long time, double precipIntensity, double precipProbability) {
        this.time = time;
        this.precipIntensity = precipIntensity;
        this.precipProbability = precipProbability;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public double getPrecipIntensity() {
        return precipIntensity;
    }

    public void setPrecipIntensity(double precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public double getPrecipProbability() {
        return precipProbability;
    }

    public void setPrecipProbability(double precipProbability) {
        this.precipProbability = precipProbability;
    }
}
