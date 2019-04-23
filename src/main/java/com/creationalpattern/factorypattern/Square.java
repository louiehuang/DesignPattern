package com.creationalpattern.factorypattern;

public class Square implements Shape {
    @Override
    public String draw() {
        System.out.println("Inside Square::draw() method.");
        return "Inside Square::draw() method.";
    }
}
