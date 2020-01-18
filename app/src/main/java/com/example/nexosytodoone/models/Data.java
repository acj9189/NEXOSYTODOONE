package com.example.nexosytodoone.models;

public class Data {

    private long time;
    private long precipIntensity;
    private long precipProbability;

    public Data() {
    }

    public Data(long time, long precipIntensity, long precipProbability) {
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

    public long getPrecipIntensity() {
        return precipIntensity;
    }

    public void setPrecipIntensity(long precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public long getPrecipProbability() {
        return precipProbability;
    }

    public void setPrecipProbability(long precipProbability) {
        this.precipProbability = precipProbability;
    }
}
