package com.example.nexosytodoone.models;

import java.util.List;

public class MinutelyWeather {

    private String summary;
    private String icon;
    List<Data> data;

    public MinutelyWeather() {
    }

    public MinutelyWeather(String summary, String icon, List<Data> data) {
        this.summary = summary;
        this.icon = icon;
        this.data = data;
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

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
}
