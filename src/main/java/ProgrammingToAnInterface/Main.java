package ProgrammingToAnInterface;

interface displayModule{
  public void display();
}

class MonitorDisplay implements displayModule{

  @Override
  public void display() {
    System.out.println("Monitor Display");
  }
}

class ProjectorDisplay implements displayModule{

  @Override
  public void display(){
    System.out.println("Projector Display");
  }
}

public class Main {
  displayModule dm;

  public void setDisplay(displayModule dm){
    this.dm = dm;
  }

  public void display(){
    dm.display();
  }

  public static void main(String[] args) {
      Main main = new Main();
      displayModule dm = new MonitorDisplay();
      main.setDisplay(dm);
      main.display();

      dm = new ProjectorDisplay();
      main.setDisplay(dm);
      main.display();
  }

}
