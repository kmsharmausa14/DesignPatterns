package Prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId){
        Shape shape = shapeMap.get(shapeId);
        return (Shape) shape.getClone();
    }

    public static void loadcache(){
        Circle circle = new Circle("Circle");
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle("Rectangle");
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
