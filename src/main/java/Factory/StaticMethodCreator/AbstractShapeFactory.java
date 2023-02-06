package Factory.StaticMethodCreator;

public class AbstractShapeFactory {

    public static Shape getShape(String shapeType){
        if(shapeType.equals("Circle"))
            return new Circle();
        else if(shapeType.equals("Rectangle"))
            return new Rectangle();
        else if(shapeType.equals("Square"))
            return new Square();
        return null;
    }
}
