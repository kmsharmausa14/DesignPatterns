package ChainOfResponsibility;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency currency);
}

class Dollar50Dispencer implements DispenseChain{

  private DispenseChain dispenseChain;

  @Override
  public void setNextChain(DispenseChain nextChain) {
    this.dispenseChain = nextChain;
  }

  @Override
  public void dispense(Currency currency) {
    if(currency.getAmount() >= 50){
        int quotient = currency.getAmount()/50;
        int remainder = currency.getAmount()%50;
      System.out.println("Dispensing " + quotient);

      if(remainder!=0){
        this.dispenseChain.dispense(new Currency(remainder));
      }
    }else
      this.dispenseChain.dispense(currency);
  }
}

class Dollar20Dispencer implements DispenseChain{
  private DispenseChain dispenseChain;
  @Override
  public void setNextChain(DispenseChain nextChain) {
    this.dispenseChain = nextChain;
  }

  @Override
  public void dispense(Currency currency) {
    if(currency.getAmount() >= 20){
      int quotient = currency.getAmount()/20;
      int remainder = currency.getAmount()%20;
      System.out.println("Dispensing " + quotient);

      if(remainder!=0){
        this.dispenseChain.dispense(new Currency(remainder));
      }
    }else
      this.dispenseChain.dispense(currency);
  }
}

class Dollar10Dispencer implements DispenseChain{
  private DispenseChain dispenseChain;
  @Override
  public void setNextChain(DispenseChain nextChain) {
    this.dispenseChain = nextChain;
  }

  @Override
  public void dispense(Currency currency) {
    if(currency.getAmount() >= 10){
      int quotient = currency.getAmount()/10;
      int remainder = currency.getAmount()%10;
      System.out.println("Dispensing " + quotient);

      if(remainder!=0){
        this.dispenseChain.dispense(new Currency(remainder));
      }
    }else
      this.dispenseChain.dispense(currency);
  }
}
