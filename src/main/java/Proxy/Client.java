package Proxy;

public class Client {

  public static void main(String[] args) {
    Image image = new ProxyImage("abcd.jpg");
    image.display();
    System.out.println("Timepass");
    image.display();
  }
}
