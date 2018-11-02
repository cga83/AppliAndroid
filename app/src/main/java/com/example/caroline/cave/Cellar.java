package com.example.caroline.cave;

import java.util.ArrayList;

public class Cellar {
    private ArrayList<Bottle> bottles;

    public Cellar() {
        bottles = new ArrayList<Bottle>();
    }

    void addBottleToList(Bottle bottle) {
        bottles.add(bottle);
    }

    void addBottle(String name, float price) {
        Bottle bottleToAdd = new Bottle(name, price);
        addBottleToList(bottleToAdd);
    }

    void addBottle(Bottle bottle) {
        addBottleToList(bottle);
    }

    Bottle getBottle(String name) {
        for (Bottle bottle : bottles) {
            if (bottle.getName().equals(name))
                return bottle;
        }
        return new Bottle();
    }

    float getTotalPriceInEuros() {
        float totalPrice = 0;
        for (Bottle bottle : bottles)
            totalPrice += bottle.getPrice();
        return totalPrice;
    }

    float getTotalPriceInDollars() {
        return getTotalPriceInEuros() * 87 / 100;
    }

    int getNumberOfBottles() {
        return bottles.size();
    }
}
