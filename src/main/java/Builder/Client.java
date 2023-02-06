package Builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        BuilderInterface carBuilder = new Car();
        BuilderInterface motorcycleBuilder = new Motorcycle();

        director.construct(carBuilder);

        Product p1 = carBuilder.getProduct();
        p1.show();
    }
}
