package com.company.abstractFactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(ShapeType shapeType) {
        if (shapeType == null) {
            return null;
        }
        switch (shapeType) {
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            case CIRCLE:
                return new Circle();
            default:
                return null;
        }
    }

    @Override
    public Color getColor(ColorType color) {
        return null;
    }
}
