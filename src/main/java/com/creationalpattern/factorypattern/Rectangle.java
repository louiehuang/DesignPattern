package com.creationalpattern.factorypattern;

public class Rectangle implements Shape {
    public String draw() {
        System.out.println("Inside Rectangle::draw() method.");
        return "Inside Rectangle::draw() method.";
    }
}