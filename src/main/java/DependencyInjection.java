interface Service{
  void write();
}

class MyService implements Service{

  @Override
  public void write() {
    System.out.println("MyService");
  }
}

public class DependencyInjection {
  Service service;

  DependencyInjection(Service service){
    this.service = service;
  }

  void setService(Service service){
    this.service = service;
  }

  void doSomething(){
    service.write();
  }

  public static void main(String[] args) {
    Service service = new MyService();
    DependencyInjection dependencyInjection = new DependencyInjection(service);
    dependencyInjection.doSomething();

    dependencyInjection.setService(service);
  }
}
