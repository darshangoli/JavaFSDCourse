public class ConditionalStatements {
    public static int subtract(int a, int b){
        int c = 0;
        if(a > b){
            c = a - b;
        }
        else if(b > a){
            c = b - a;
        }
        else{
            c = 0;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(subtract(5, 5));
    }
}
