package Observer;

public class Client {
    public static void main(String[] args) {
        MyTopic myTopic = new MyTopic();

        Observer observer1 = new MyTopicSubscriber("Obj1");
        Observer observer2 = new MyTopicSubscriber("Obj2");
        Observer observer3 = new MyTopicSubscriber("Obj3");

        myTopic.register(observer1);
        myTopic.register(observer2);
        myTopic.register(observer3);

        observer1.setSubject(myTopic);
        observer2.setSubject(myTopic);
        observer3.setSubject(myTopic);

        observer1.update();

        myTopic.postMessage("New Message");
    }
}
