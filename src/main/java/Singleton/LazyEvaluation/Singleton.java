package Singleton.LazyEvaluation;

public class Singleton {
    private static Singleton uniqueInstance = null;
    private int counter = 0;

    private void Singleton(){}

    public void setCounter(int value){
        this.counter = value;
    }

    public int getCounter(){
        return counter;
    }

    public static Singleton getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new Singleton();
        return uniqueInstance;
    }
}
