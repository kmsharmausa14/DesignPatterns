package Decorator.Example1;

abstract class AbstractDecorator extends Component{
    protected Component component;

    public void setTheComponent(Component component){
      this.component = component;
    }

    public void doJob(){
      if(component!= null)
        component.doJob();
    }
}

class ConcreteDecorator1 extends AbstractDecorator{
  public void doJob(){
    super.doJob();
    System.out.println("Decorator 1");
    if(component!= null)
      component.doJob();
  }
}

class ConcreteDecorator2 extends AbstractDecorator{
  public void doJob(){
    super.doJob();
    System.out.println("Decorator 2");
    if(component!= null)
      component.doJob();
  }
}
