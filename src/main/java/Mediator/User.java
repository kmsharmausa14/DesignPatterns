package Mediator;

abstract class User {
   String name;
   ChatMediator chatMediator;

  public User(String name, ChatMediator chatMediator){
    this.chatMediator = chatMediator;
    this.name = name;
  }

  public abstract void send(String message);
  public abstract void receive(String message);
}

class UserImpl extends User{

  public UserImpl(String name, ChatMediator chatMediator){
    super(name, chatMediator);
  }

  @Override
  public void send(String message) {
    chatMediator.sendMessage( this, message);
  }

  @Override
  public void receive(String message) {
    System.out.println("Message Received");
  }
}
