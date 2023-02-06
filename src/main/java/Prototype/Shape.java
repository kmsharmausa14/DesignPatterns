package Prototype;

public abstract class Shape implements Cloneable{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;

    public Object getClone(){
        Object clone = null;

        try{
            clone = super.clone();
        }
        catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }
        return clone;
    }

    abstract void draw();
}

class Circle extends Shape {
    public Circle(String type){
        this.setType(type);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    public Rectangle(String type){
        this.setType(type);
    }
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Square extends Shape {
    public Square(String type){
        this.setType(type);
    }
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
