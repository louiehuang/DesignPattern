package com.creationalpattern.abstractfactorypattern;

import com.creationalpattern.abstractfactorypattern.color.Color;
import com.creationalpattern.abstractfactorypattern.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
