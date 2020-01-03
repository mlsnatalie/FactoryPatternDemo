package com.company.abstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(ChoiceType choice) {
        switch (choice) {
            case SHAPE:
                return new ShapeFactory();
            case COLOR:
                return new ColorFactory();
            default:
                return null;
        }
    }
}
