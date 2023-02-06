package Factory.ConcreteCreator;

public class Client {
    public static void main(String[] args) {
        Shape shape = new AbstractShapeFactory().getShape("Circle");
        shape.draw();
    }
}
