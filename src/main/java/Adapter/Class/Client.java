package Adapter.Class;

public class Client {
    public static void main(String[] args) {
        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter.getInteger();

        ObjectAdapter objectAdapter = new ObjectAdapter(new IntegerValue());
        objectAdapter.getInteger();
    }
}
