package Part1.module5_ArraysAndCollections.lesson12_searchingAndSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(){{add("ccc"); add("zzz"); add("aaa"); add("bbb"); }};
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list, "ccc"));
        System.out.println(Collections.binarySearch(list, "iii"));


    }
}
