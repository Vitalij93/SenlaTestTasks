package com.yaroshuk;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private List<Thing> things = new ArrayList<>();
    private int carentCapacity;
    private int capacity;
    private double cost;

    Backpack(int capacity) {
        this.capacity = capacity;
    }

    boolean add(Thing thing) {
        int newCapacity = carentCapacity + thing.getWeight();
        if (capacity < newCapacity) {
            return false;
        }
        carentCapacity = newCapacity;
        cost = cost + thing.getCost();
        return things.add(thing);
    }

    @Override
    public String toString() {
        return "Current cost = " + cost + " weight = " + carentCapacity;
    }
}
