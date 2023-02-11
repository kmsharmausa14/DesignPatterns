package Mediator;

public class Client {

  public static void main(String[] args) {
    ChatMediator chatMediator = new ChatMediatorImpl();

    User user1 = new UserImpl("A", chatMediator);
    User user2 = new UserImpl("B", chatMediator);
    User user3 = new UserImpl("C", chatMediator);
    User user4 = new UserImpl("D", chatMediator);

    chatMediator.addUser(user1);
    chatMediator.addUser(user2);
    chatMediator.addUser(user3);
    chatMediator.addUser(user4);

    user1.send("Hi all");
  }
}
