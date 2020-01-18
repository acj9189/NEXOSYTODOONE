package com.example.nexosytodoone.models;

import java.util.List;

public class DailyWeather {

    private String summary;
    private String icon;
    List<DataDaily> data;

    public DailyWeather() {
    }

    public DailyWeather(String summary, String icon, List<DataDaily> data) {
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

    public List<DataDaily> getData() {
        return data;
    }

    public void setData(List<DataDaily> data) {
        this.data = data;
    }
}
