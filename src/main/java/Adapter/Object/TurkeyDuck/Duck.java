package Adapter.Object.TurkeyDuck;

interface Duck {
    void quack();
    void fly();
}

class MallardDuck implements Duck{

    @Override
    public void quack() {
        System.out.println("Duck Quack");
    }

    @Override
    public void fly() {
        System.out.println("Duck Fly");
    }
}
