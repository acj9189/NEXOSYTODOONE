package com.example.nexosytodoone.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class Wind {

    @SerializedName("speed")
    @Expose
    private double speed;

    @SerializedName("deg")
    @Expose
    private long deg;

    public Wind() {
    }

    public Wind(double speed, long deg) {
        this.speed = speed;
        this.deg = deg;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public long getDeg() {
        return deg;
    }

    public void setDeg(long deg) {
        this.deg = deg;
    }
}
