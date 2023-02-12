package State;

public abstract class RemoteControl {
    public abstract void pressSwitch(TV context);
}

class On extends RemoteControl{

    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am already ON. Turning off");
        context.setState(new Off());
    }
}

class Off extends RemoteControl{

    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am already Off. Turning on");
        context.setState(new On());
    }
}
