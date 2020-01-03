package com.company;

import com.company.factory.Shape;
import com.company.factory.ShapeFactory;

public class FactoryPatternDemo {

    public static void main(String[] args) {
	// write your code here
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}