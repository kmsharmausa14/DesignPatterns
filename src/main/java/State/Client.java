package State;

public class Client {
    public static void main(String[] args) {
        Off offState = new Off();
        TV tv = new TV(offState);

        tv.pressButton();
        tv.pressButton();
    }
}
