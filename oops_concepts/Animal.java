package oops_concepts;

public class Animal {
    void eat(){
        System.out.println("Animal eats");
    }
}
class Dog extends Animal{
    void barks(){
        System.out.println("Dog barks");
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.barks();
        dog.eat();
    }
}
