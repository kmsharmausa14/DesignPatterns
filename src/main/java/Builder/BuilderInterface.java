package Builder;

public interface BuilderInterface {
    void addBody();
    void addWheels();
    void addHeadlights();
    Product getProduct();
}

class Motorcycle implements BuilderInterface{
    private Product product = new Product();

    @Override
    public void addBody() {
        product.add("Motorcycle Body");
    }

    @Override
    public void addWheels() {
        product.add("Motorcycle Wheels");
    }

    @Override
    public void addHeadlights() {
        product.add("Motorcycle Headlights");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}

class Car implements BuilderInterface{
    private Product product = new Product();

    @Override
    public void addBody() {
        product.add("Car Body");
    }

    @Override
    public void addWheels() {
        product.add("Car Wheels");
    }

    @Override
    public void addHeadlights() {
        product.add("Car Headlights");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
