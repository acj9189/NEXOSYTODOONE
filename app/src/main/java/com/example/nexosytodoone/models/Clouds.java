package com.example.nexosytodoone.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class Clouds {

    @SerializedName("all")
    @Expose
    private long all;

    public Clouds() {
    }

    public Clouds(long all) {
        this.all = all;
    }

    public long getAll() {
        return all;
    }

    public void setAll(long all) {
        this.all = all;
    }
}
