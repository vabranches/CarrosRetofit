package com.example.logonrm.carrosretofit;

import com.google.gson.annotations.SerializedName;

public class Carro {
    @SerializedName("marca")
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @SerializedName("modelo")
    private String model;

    @SerializedName("cor")
    private String color;
}
