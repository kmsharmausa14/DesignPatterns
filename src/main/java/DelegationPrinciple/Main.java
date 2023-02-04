package DelegationPrinciple;

class RealPrinter{
  void display(){
    System.out.println("Displaying...");
  }
}

class Printer{
  RealPrinter realPrinter = new RealPrinter();

  void display(){
    realPrinter.display();
  }
}

public class Main {

  public static void main(String[] args) {
    Printer printer = new Printer();
    printer.display();
  }
}
