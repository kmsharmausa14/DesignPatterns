package Decorator.Example1;

public class Client {

  public static void main(String[] args) {
    ConcreteComponent concreteComponent1 = new ConcreteComponent();

    ConcreteDecorator1 concreteDecorator1 = new ConcreteDecorator1();
    concreteDecorator1.setTheComponent(concreteComponent1);
    concreteDecorator1.doJob();

    ConcreteDecorator2 concreteDecorator2 = new ConcreteDecorator2();
    concreteDecorator2.setTheComponent(concreteDecorator1);
    concreteDecorator2.doJob();
  }
}
