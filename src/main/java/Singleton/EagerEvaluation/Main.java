package Singleton.EagerEvaluation;

import Singleton.Synchronized.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setCounter(55);
        System.out.println(singleton.getCounter());
        singleton = null;
        singleton = Singleton.getInstance();
        System.out.println(singleton.getCounter());
    }
}
