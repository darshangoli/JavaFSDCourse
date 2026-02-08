package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> treeset = new TreeSet<>();
        set.add(1);
        set.add(1);
        set.add(-3);
        set.add(6);
        set.add(8);
        set.add(2);
        treeset.addAll(set);
        System.out.println(set.size());
        System.out.println(set);
        System.out.println(treeset);
    }
}
