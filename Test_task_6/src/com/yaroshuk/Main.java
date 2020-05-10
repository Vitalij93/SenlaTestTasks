package com.yaroshuk;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Backpack backpack = new Backpack(15);
        Thing t1 = new Thing(3, 32);
        Thing t2 = new Thing(1, 3);
        Thing t3 = new Thing(7, 14);
        Thing t4 = new Thing(12, 130);
        Thing t5 = new Thing(9, 67);
        Thing t6 = new Thing(4, 48);
        Thing t7 = new Thing(7, 2);
        Thing t8 = new Thing(2, 65);
        Thing t9 = new Thing(1, 46);
        Thing t10 = new Thing(5, 89);
        List<Thing> addThing = new ArrayList<>();
        addThing.add(t1);
        addThing.add(t2);
        addThing.add(t3);
        addThing.add(t4);
        addThing.add(t5);
        addThing.add(t6);
        addThing.add(t7);
        addThing.add(t8);
        addThing.add(t9);
        addThing.add(t10);
        addThing.sort(Comparator.comparingDouble(Thing::getKf).reversed());
        for (Thing thing : addThing) {
            backpack.add(thing);
        }
        System.out.println(backpack.toString());

    }
}
