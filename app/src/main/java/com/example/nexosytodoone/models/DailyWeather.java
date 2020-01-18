package com.example.nexosytodoone.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DailyWeather {

    @SerializedName("data")
    @Expose
    private List<DataDaily> data = null;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("summary")
    @Expose
    private String summary;

    public DailyWeather() {
    }

    public DailyWeather(List<DataDaily> data, String icon, String summary) {
        this.data = data;
        this.icon = icon;
        this.summary = summary;
    }

    public List<DataDaily> getData() {
        return data;
    }

    public void setData(List<DataDaily> data) {
        this.data = data;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}