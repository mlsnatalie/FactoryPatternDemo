package com.company.factory;


import javax.lang.model.type.UnknownTypeException;

public class ShapeFactory {

    public static Shape getShape(ShapeType shapeType) {
        if (shapeType == null) {
            return null;
        }
//        if (shapeType.equalsIgnoreCase("CIRCLE")) {
//            return new Circle();
//        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
//            return new Rectangle();
//        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
//            return new Square();
//        }
//        return null;

        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                return null;
        }
    }
}
