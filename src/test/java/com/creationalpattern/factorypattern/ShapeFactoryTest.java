package com.creationalpattern.factorypattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShapeFactoryTest {
    @Test
    public void TestShape() {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        Assertions.assertEquals(shape1.draw(), "Inside Circle::draw() method.");

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        Assertions.assertEquals(shape2.draw(), "Inside Rectangle::draw() method.");

        Shape shape3 = shapeFactory.getShape("SQUARE");
        Assertions.assertEquals(shape3.draw(), "Inside Square::draw() method.");
    }

}