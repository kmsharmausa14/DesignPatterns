package Iterator;

class NotificationIterator implements Iterator{
  int pos = 0;
  Notification[] notifications;

  public NotificationIterator(Notification[] notifications){
    this.notifications = notifications;
  }

  @Override
  public boolean hasNext() {
    if(pos>= notifications.length || notifications[pos] == null)
      return false;
    return true;
  }

  @Override
  public Object next() {
    Notification notification = notifications[pos];
    pos+=1;
    return notification;
  }
}
