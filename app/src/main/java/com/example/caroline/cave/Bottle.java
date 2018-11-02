package com.example.caroline.cave;

import java.io.Serializable;

public class Bottle implements Serializable {
    private String bottleName;
    private float bottlePrice;

    public Bottle() {
        bottleName = "";
        bottlePrice = 0;
    }

    public Bottle(String name, float price) {
        bottleName = name;
        bottlePrice = price;
    }

    public String getName() {
        return bottleName;
    }

    public float getPrice() {
        return bottlePrice;
    }
}
