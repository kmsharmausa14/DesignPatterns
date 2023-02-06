package AbstractFactory;

interface Color {
    void fill();
}

class Red implements Color{

    @Override
    public void fill() {
        System.out.println("Coloring Red");
    }
}

class Blue implements Color{

    @Override
    public void fill() {
        System.out.println("Coloring Blue");
    }
}

class Green implements Color{

    @Override
    public void fill() {
        System.out.println("Coloring Green");
    }
}