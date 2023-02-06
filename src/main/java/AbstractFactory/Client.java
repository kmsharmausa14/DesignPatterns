package AbstractFactory;

import Factory.AbstractCreator.AbstractShapeFactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        Shape shape = shapeFactory.getShape("Circle");
        shape.draw();
    }
}
