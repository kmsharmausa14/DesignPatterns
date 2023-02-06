package Factory.AbstractCreator;

public class Client {
    public static void main(String[] args) {
        Shape shape = new CircleFactory().getShape();
        shape.draw();
    }
}
