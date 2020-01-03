package com.company.abstractFactory;

public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(ShapeType shape) {
        return null;
    }

    @Override
    public Color getColor(ColorType colorType) {
        if (colorType == null) {
            return null;
        }
        switch (colorType) {
            case RED:
                return new Red();
            case BLUE:
                return new Blue();
            case GREEN:
                return new Green();
            default:
                return null;
        }
    }
}
