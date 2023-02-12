package Observer;

import java.util.ArrayList;
import java.util.List;

interface Subject {
    public void register(Observer obj);
    public void unregister(Observer obj);
    public void notifyObservers();
    public Object getUpdate(Observer obj);
}

class MyTopic implements Subject{
    private String message;
    private boolean changed;
    private List<Observer> observers;

    public MyTopic(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if(obj==null)
            throw new NullPointerException();
        if(!observers.contains(obj))
            observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal;
        if(!changed)
            return;
        observersLocal = new ArrayList<Observer>(this.observers);
        changed = false;
        for(Observer observer : observersLocal)
            observer.update();
    }

    @Override
    public Object getUpdate(Observer obj) {
        return message;
    }

    public void postMessage(String message){
        System.out.println(message);
        this.message = message;
        this.changed = true;
        notifyObservers();
    }
}
