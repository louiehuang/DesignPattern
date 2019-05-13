package com.creationalpattern.factorypattern;

public class Circle implements Shape {
    public String draw() {
        System.out.println("Inside Circle::draw() method.");
        return "Inside Circle::draw() method.";
    }
}