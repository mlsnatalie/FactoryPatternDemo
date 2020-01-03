package com.company.abstractFactory;

public abstract class AbstractFactory {
    public abstract Shape getShape(ShapeType shape);
    public abstract Color getColor(ColorType color);
}
