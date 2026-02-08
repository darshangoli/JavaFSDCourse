package Exception_Handling;
import oops_concepts.Animal;

public class ClassNotFound {
    static void classNotFound() throws ClassNotFoundException {
        Class.forName("ListPogram");
    }
    public static void main(String[] args) {
        try {
            classNotFound();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
