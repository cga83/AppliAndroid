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

    Bottle getBottle(String name) {
        for (Bottle bottle : bottles) {
            if (Bottle.getName(bottle).equals(name))
                return bottle;
        }
        return new Bottle();
    }

    float getTotalPriceInEuros() {
        float totalPrice = 0;
        for (Bottle bottle : bottles)
            totalPrice += Bottle.getPrice(bottle);
        return totalPrice;
    }

    float getTotalPriceInDollars() {
        return getTotalPriceInEuros()*87/100;
    }

    int getNumberOfBottles() {
        return bottles.size();
    }
}
