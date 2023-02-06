package Factory.StaticMethodCreator;

public class Client {
    public static void main(String[] args) {
        Shape shape = AbstractShapeFactory.getShape("Circle");
        shape.draw();
    }
}
