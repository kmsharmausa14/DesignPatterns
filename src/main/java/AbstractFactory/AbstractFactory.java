package AbstractFactory;

public abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);
    abstract Color getColor(String colorType);
}

class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equals("Circle"))
            return new Circle();
        else if(shapeType.equals("Rectangle"))
            return new Rectangle();
        else if(shapeType.equals("Square"))
            return new Square();
        return null;
    }

    @Override
    Color getColor(String colorType) {
        return null;
    }
}

class ColorFactory extends AbstractFactory {
    @Override
    Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String colorType){
        if(colorType.equals("Red"))
            return new Red();
        else if(colorType.equals("Blue"))
            return new Blue();
        else if(colorType.equals("Green"))
            return new Green();
        return null;
    }
}