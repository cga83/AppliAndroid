package com.example.caroline.cave;

public class Bottle {
    private static String bottleName;
    private static  float bottlePrice;

    public Bottle() {
        bottleName = "";
        bottlePrice = 0;
    }

    public Bottle(String name, float price) {
        bottleName = name;
        bottlePrice = price;
    }

    public static String getName(Bottle bottle) {
        return bottleName;
    }

    public static float getPrice(Bottle bottle) {
        return bottlePrice;
    }
}
