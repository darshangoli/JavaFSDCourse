package oops_concepts;

public class Polymorphism {
    int add(int a, int b){
        int c = a+b;
        return c;
    }
    int add(int a, int b, int c){
        int d = a+b+c;
        return d;
    }
    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();
        System.out.println(obj.add(4, 9));
        System.out.println(obj.add(4, 9, 11));
    }
}
