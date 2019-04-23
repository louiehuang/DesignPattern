package com.creationalpattern.builderpattern;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
