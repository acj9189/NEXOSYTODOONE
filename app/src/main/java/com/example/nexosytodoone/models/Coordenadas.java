package com.example.nexosytodoone.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class Coordenadas {

    @SerializedName("lon")
    @Expose
    private long lon;

    @SerializedName("lat")
    @Expose
    private long lat;

    public Coordenadas() {
    }

    public Coordenadas(long lon, long lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public long getLon() {
        return lon;
    }

    public void setLon(long lon) {
        this.lon = lon;
    }

    public long getLat() {
        return lat;
    }

    public void setLat(long lat) {
        this.lat = lat;
    }
}
