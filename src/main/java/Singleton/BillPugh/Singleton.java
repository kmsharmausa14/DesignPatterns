package Singleton.BillPugh;

public class Singleton {

    private void Singleton(){}

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    private int counter;

    private static class SingletonHelper{
        private static final Singleton uniqueInstance = new Singleton();
    }

    public static synchronized Singleton getInstance(){
        return SingletonHelper.uniqueInstance;
    }
}
