package TemplateMethod;

abstract class HouseTemplate {
    public void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built");
    }

    private void buildWindows(){
        System.out.println("Building glass windows");
    }

    private void buildFoundation(){
        System.out.println("Building metal foundation");
    }

    public abstract void buildPillars();
    public abstract void buildWalls();
}

class WoodenHouse extends HouseTemplate{

    @Override
    public void buildPillars() {
        System.out.println("Building wooden pillars");
    }

    @Override
    public void buildWalls() {
        System.out.println("Building wooden walls");
    }
}

class GlassHouse extends HouseTemplate{

    @Override
    public void buildPillars() {
        System.out.println("Building Glass pillars");
    }

    @Override
    public void buildWalls() {
        System.out.println("Building Glass walls");
    }
}
