package Bridge;

abstract class Workshop {
    abstract void work();
}

class Produce extends Workshop{

    @Override
    void work() {
        System.out.println("Producing");
    }
}

class Assemble extends Workshop{

    @Override
    void work() {
        System.out.println("Assembling");
    }
}
