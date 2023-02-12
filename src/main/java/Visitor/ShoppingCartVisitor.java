package Visitor;

public interface ShoppingCartVisitor {
    int visit(Fruit fruit);
    int visit(Book book);
}

class ShoppingCartVisitorImpl implements ShoppingCartVisitor{

    @Override
    public int visit(Fruit fruit) {
        return fruit.getPricePerKG() * fruit.getWeight();
    }

    @Override
    public int visit(Book book) {
        int cost = 0;
        if(book.getPrice() > 50)
            cost = book.getPrice() - 5;
        else
            cost = book.getPrice();
        return cost;
    }
}
