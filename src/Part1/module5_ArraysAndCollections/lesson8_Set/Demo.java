package Part1.module5_ArraysAndCollections.lesson8_Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();//unique elements unordered
        set.add("first");
        set.add("second");
        set.add("second");
        set.add("thirst");
        System.out.println(set);
        System.out.println(set.contains("second"));

        Set<String> set1 = new TreeSet<>();//unique elements  ordered
        set1.add("first");
        set1.add("second");
        set1.add("second");
        set1.add("thirst");

        System.out.println(set1);

    }
}
