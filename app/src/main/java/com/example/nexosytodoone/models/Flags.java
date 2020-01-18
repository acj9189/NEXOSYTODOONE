package com.example.nexosytodoone.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Flags {

    @SerializedName("darksky-stations")
    @Expose
    private List<String> darkskyStations = null;

    @SerializedName("isd-stations")
    @Expose
    private List<String> isdStations = null;

    @SerializedName("lamp-stations")
    @Expose
    private List<String> lampStations = null;

    @SerializedName("madis-stations")
    @Expose
    private List<String> madisStations = null;

    @SerializedName("sources")
    @Expose
    private List<String> sources = null;

    @SerializedName("units")
    @Expose
    private String units;

    public Flags() {
    }

    public Flags(List<String> darkskyStations, List<String> isdStations, List<String> lampStations, List<String> madisStations, List<String> sources, String units) {
        this.darkskyStations = darkskyStations;
        this.isdStations = isdStations;
        this.lampStations = lampStations;
        this.madisStations = madisStations;
        this.sources = sources;
        this.units = units;
    }

    public List<String> getDarkskyStations() {
        return darkskyStations;
    }

    public void setDarkskyStations(List<String> darkskyStations) {
        this.darkskyStations = darkskyStations;
    }

    public List<String> getIsdStations() {
        return isdStations;
    }

    public void setIsdStations(List<String> isdStations) {
        this.isdStations = isdStations;
    }

    public List<String> getLampStations() {
        return lampStations;
    }

    public void setLampStations(List<String> lampStations) {
        this.lampStations = lampStations;
    }

    public List<String> getMadisStations() {
        return madisStations;
    }

    public void setMadisStations(List<String> madisStations) {
        this.madisStations = madisStations;
    }

    public List<String> getSources() {
        return sources;
    }

    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }
}
