package Exception_Handling;
public class ExceptionHandling {
    int divide(int a) throws ArithmeticException{
        int result = a/0;
        return result;
    }
    int arrayIndex() throws ArrayIndexOutOfBoundsException{
        int[] arr = {1,2,3,4,5};
        int result = arr[6];
        return result;
    }
    void voting(int age){
        if(age < 18){  
            throw new IllegalArgumentException("age should be greater than 18");
        }
        System.out.println("eligible to vote");
    }

    public static void main(String[] args) {
        ExceptionHandling obj = new ExceptionHandling();
        try{
            obj.arrayIndex();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("access within the length of array");
        }
        
        try{
            obj.divide(5);
        }catch (ArithmeticException e){
            System.out.println("Should not be divided by 0");
        }

        try{
            obj.voting(2);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
    }
}
