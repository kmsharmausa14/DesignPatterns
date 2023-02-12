package Strategy;

public class Item {
    private String upCcpde;
    private int price;

    public Item(String upCcpde, int price) {
        this.upCcpde = upCcpde;
        this.price = price;
    }

    public String getUpCcpde() {
        return upCcpde;
    }

    public int getPrice() {
        return price;
    }
}
