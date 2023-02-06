package Singleton.EagerEvaluation;

public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    private void Singleton(){}

    public static Singleton getInstance(){
        return uniqueInstance;
    }
}
