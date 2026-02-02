package oops_concepts;

abstract class Shape{
    abstract void draw();
}

interface Shape1 {
    void draw1();    
}

public class Abstraction implements Shape1 {

    @Override
    public void draw1() {
        System.out.println("Drawing");
    }
    public static void main(String[] args) {
        Shape1 shape = new Abstraction();
        shape.draw1();
    }
}
