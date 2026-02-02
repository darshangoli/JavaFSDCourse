public class HelloWorld {
    private static int add(int a, int b, int c){
        int d = a + b + c;
        return d;
    }
    public static void main(String[] args) {
        int a = 100;
        int b = 150;
        int c = 120;
        System.out.println(add(a,b,c));
    }
}
