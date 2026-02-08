package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
        Map<Integer,String> treeMap = new TreeMap<>();
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        hashMap.put(3003, "Priya");
        hashMap.put(3001, "harshith");
        hashMap.put(3002,"Darshan");
        hashMap.put(3000, "Ram");
        hashMap.put(2007,"Satya");
        treeMap.putAll(hashMap);

        linkedHashMap.put(3003, "Priya");
        linkedHashMap.put(3001, "harshith");
        linkedHashMap.put(3002,"Darshan");
        linkedHashMap.put(3000, "Ram");
        linkedHashMap.put(2007,"Satya");
        System.out.println(hashMap);
        // System.out.println(treeMap);
        System.out.println(linkedHashMap);
    }
}
