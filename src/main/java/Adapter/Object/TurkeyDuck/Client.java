package Adapter.Object.TurkeyDuck;

public class Client {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        wildTurkey.squabble();
        wildTurkey.fly();

        mallardDuck.quack();
        mallardDuck.fly();

        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.fly();
        duck.quack();
    }
}
