package AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        if(type.equals("Color"))
            return new ColorFactory();
        else if(type.equals("Shape"))
            return new ShapeFactory();
        return null;
    }
}
