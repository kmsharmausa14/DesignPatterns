package Adapter.Object.CalculatorTriangle;

public class Client {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 20);
        CalculatorInterface calculatorAdaptor = new CalculatorAdaptor(triangle);

        System.out.println("Area of traiangle "+ calculatorAdaptor.getArea(null));
    }
}
