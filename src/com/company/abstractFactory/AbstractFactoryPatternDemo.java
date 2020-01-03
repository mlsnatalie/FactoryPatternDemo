package com.company.abstractFactory;

public class AbstractFactoryPatternDemo {
    public AbstractFactoryPatternDemo() {
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory(ChoiceType.SHAPE);
        //获取形状为 Circle 的对象
        Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);
        shape1.draw();

        Shape shape2 = shapeFactory.getShape(ShapeType.RECTANGLE);
        shape2.draw();

        Shape shape3 = shapeFactory.getShape(ShapeType.SQUARE);
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory(ChoiceType.COLOR);

        Color color1 = colorFactory.getColor(ColorType.RED);
        color1.fill();

        Color color2 = colorFactory.getColor(ColorType.GREEN);
        color2.fill();

        Color color3 = colorFactory.getColor(ColorType.BLUE);
        color3.fill();
    }
}
