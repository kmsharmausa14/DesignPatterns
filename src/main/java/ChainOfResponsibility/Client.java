package ChainOfResponsibility;

import java.util.Scanner;

public class Client {
  private DispenseChain c1;

  public Client() {
    this.c1 = new Dollar50Dispencer();
    DispenseChain c2 = new Dollar20Dispencer();
    DispenseChain c3 = new Dollar10Dispencer();

    c1.setNextChain(c2);
    c2.setNextChain(c3);
  }


  public static void main(String[] args) {
    Client atmdispencer = new Client();
    while(true){
      int amount = 0;
      System.out.println(("Enter amount"));
      Scanner input = new Scanner(System.in);
      amount = input.nextInt();

      if (amount % 10 != 0) {
        System.out.println("Put multiples of 10");
        return;
      }

      atmdispencer.c1.dispense(new Currency(amount));
    }
  }
}
