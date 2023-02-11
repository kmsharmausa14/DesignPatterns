package ChainOfResponsibility;

public class Currency {

  public Currency(int amount) {
    this.amount = amount;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  private int amount;

}
