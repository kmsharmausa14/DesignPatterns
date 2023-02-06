package Adapter.Object.TurkeyDuck;

interface Turkey {
    void squabble();
    void fly();
}

class WildTurkey implements Turkey{

    @Override
    public void squabble() {
        System.out.println("Squabble");
    }

    @Override
    public void fly() {
        System.out.println("Fly");
    }
}
