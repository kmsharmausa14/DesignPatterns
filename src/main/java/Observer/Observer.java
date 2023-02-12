package Observer;

interface Observer {
    public void update();
    public void setSubject(Subject subject);
}

class MyTopicSubscriber implements Observer{
    private String name;
    private Subject topic;

    public MyTopicSubscriber(String name){
        this.name = name;
    }
    @Override
    public void update() {
        String message = (String) topic.getUpdate(this);
        if(message == null)
            System.out.println(name + ":: No new message");
        else
            System.out.println(name + ":: Consuming Message:: " + message);
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
