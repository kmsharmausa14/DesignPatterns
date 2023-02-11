package Mediator;

import java.util.ArrayList;
import java.util.List;

interface ChatMediator {
  void addUser(User user);
  void sendMessage(User user, String msg);
}

class ChatMediatorImpl implements ChatMediator{
  private List<User> users;

  public ChatMediatorImpl(){
    this.users = new ArrayList<>();
  }

  @Override
  public void addUser(User user) {
  users.add(user);
  }

  @Override
  public void sendMessage(User user, String msg) {
    for(User u : users){
      if(u != user)
        u.receive(msg);
    }
  }
}
