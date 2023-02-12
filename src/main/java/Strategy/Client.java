package Strategy;

public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("111", 50);
        Item item2 = new Item("222", 60);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new CreditCardPaymentStrategy("Krishna","133645745734584","833", "12/15"));
        cart.pay(new PaypalPaymentStrategy("ks3804@nyu.edu", "Vishal@123"));
    }
}
