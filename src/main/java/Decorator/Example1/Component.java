package Decorator.Example1;

abstract class Component {
    public abstract void doJob();
}

class ConcreteComponent extends Component{

  @Override
  public void doJob() {
    System.out.println("Concrete Component : Closed for modification");
  }
}
