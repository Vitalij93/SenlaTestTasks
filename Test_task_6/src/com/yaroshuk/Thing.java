package com.yaroshuk;

public class Thing {
    private int weight;
    private double cost;

    public Thing(int weight, int cost) {
        this.weight = weight;
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }

    public double getKf() {
        return cost / weight;
    }
}
