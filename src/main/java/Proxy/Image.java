package Proxy;

public interface Image  {
  void display();
}

class RealImage implements Image{
  private String image;

  public RealImage(String image){
    this.image = image;
    loadFromDisk(image);
  }

  @Override
  public void display() {
    System.out.println("Displaying "+ image);
  }

  private void loadFromDisk(String image){
    System.out.println("Loading from disk");
  }
}
