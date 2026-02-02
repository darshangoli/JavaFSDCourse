import java.util.ArrayList;
import java.util.List;

public class ListProgram {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.remove(0);
        list.remove(0);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.isEmpty());
    }
}
