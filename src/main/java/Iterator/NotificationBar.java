package Iterator;

public class NotificationBar {
  NotificationCollection notificationCollection;

  public NotificationBar(NotificationCollection notificationCollection){
    this.notificationCollection = notificationCollection;
  }

  public void printNotifications(){
    Iterator iterator = notificationCollection.createIterator();
    while (iterator.hasNext()){
      Notification notification = (Notification) iterator.next();
      System.out.println(notification.getNotification());
    }
  }
}
