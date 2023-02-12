package Visitor;

public class Client {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{new Book(50, "rgwergwg2356525"), new Fruit(34, 10, "Strawberry")};
        int total = calculatePrice(items);
        System.out.println(total);
    }

    private static int calculatePrice(ItemElement[] items){
        int sum = 0;
        ShoppingCartVisitorImpl shoppingCartVisitor = new ShoppingCartVisitorImpl();
        for(ItemElement item : items){
            sum += item.accept(shoppingCartVisitor);
        }
        return sum;
    }
}
