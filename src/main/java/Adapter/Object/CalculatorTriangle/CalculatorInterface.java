package Adapter.Object.CalculatorTriangle;

public interface CalculatorInterface {
    public double getArea(Rectangle rectangle);
}

class Calculator implements CalculatorInterface{
    Rectangle rectangle;
    @Override
    public double getArea(Rectangle rectangle) {
        rectangle= rectangle;
        return rectangle.length * rectangle.breadth;
    }
}
