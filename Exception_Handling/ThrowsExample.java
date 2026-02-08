package Exception_Handling;
public class ThrowsExample {
    void checkMarks(int marks){
        if(marks < 0 || marks > 100){
           throw new IllegalArgumentException("marks should not be between 0 and 100");
        }
        else{
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ThrowsExample obj = new ThrowsExample();
        try{
            obj.checkMarks(101);
        } catch(Exception e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("finally will executes for sure");
        }
    }
}
