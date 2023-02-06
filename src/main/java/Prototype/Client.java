package Prototype;

public class Client {
    public static void main(String[] args) {
        ShapeCache.loadcache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println(clonedShape.getType());

        Shape clonedShape1 = ShapeCache.getShape("2");
        System.out.println(clonedShape1.getType());
    }
}
