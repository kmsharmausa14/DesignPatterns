package Adapter.Object.CalculatorTriangle;

public class CalculatorAdaptor implements CalculatorInterface{
    Calculator calculator;
    Triangle triangle;

    public CalculatorAdaptor(Triangle triangle){
        this.triangle = triangle;
    }

    @Override
    public double getArea(Rectangle rectangle) {
        calculator = new Calculator();
        Rectangle rectangle1 = new Rectangle(10,20);
        rectangle1.breadth = triangle.base;
        rectangle1.length = 2 * triangle.height;;
        return calculator.getArea(rectangle1);
    }
}
