package Builder;

public class Director {
    BuilderInterface builderInterface;

    void construct(BuilderInterface builderInterface){
        this.builderInterface = builderInterface;
        this.builderInterface.addBody();
        this.builderInterface.addHeadlights();
        this.builderInterface.addWheels();
    }
}
