package Iterator;

interface Collection {
  public Iterator createIterator();
}

class NotificationCollection implements Collection{
  int numberOfItems = 0;
  int MAX_ITEMS = 6;

  Notification[] notificationList;

  public NotificationCollection(){
    notificationList = new Notification[MAX_ITEMS];
    addItems("A");
    addItems("B");
    addItems("C");
  }

  public void addItems(String str){
    Notification notification = new Notification(str);

    notificationList[numberOfItems] = notification;
    numberOfItems += 1;
  }

  @Override
  public Iterator createIterator() {
    return new NotificationIterator(notificationList);
  }
}
