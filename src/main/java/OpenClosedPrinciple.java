class Circle implements Shape{
  public int radius;

  @Override
  public double calculateArea(){
    return (22/7) * radius * radius;
  }
}

class Rectangle implements Shape{
  int breadth;
  int height;

  @Override
  public double calculateArea(){
    return breadth * height;
  }
}

 interface Shape{
  public double calculateArea();
}
class CalculateArea{
  Shape shape;

  void setShape(Shape shape){
    this.shape = shape;
  }

  double calculateArea(){
    return shape.calculateArea();
  }
}

public class OpenClosedPrinciple {

  public static void main(String[] args) {
    CalculateArea calculateArea = new CalculateArea();
    Shape shape = new Circle();
    calculateArea.setShape(shape);
    calculateArea.calculateArea();

    shape = new Rectangle();
    calculateArea.setShape(shape);
    calculateArea.calculateArea();
  }
}
