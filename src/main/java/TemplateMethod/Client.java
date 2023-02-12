package TemplateMethod;

public class Client {
    public static void main(String[] args) {
        HouseTemplate houseTemplate = new WoodenHouse();
        houseTemplate.buildHouse();

        houseTemplate = new GlassHouse();
        houseTemplate.buildHouse();
    }
}
