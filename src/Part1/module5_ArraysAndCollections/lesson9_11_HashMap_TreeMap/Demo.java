package Part1.module5_ArraysAndCollections.lesson9_11_HashMap_TreeMap;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {

//        HashMap<String, Integer> goodsList = new HashMap<>(); unsorted
        TreeMap<String, Integer> goodsList = new TreeMap<>();//sorted by key (alphabetic)

        Scanner scanner = new Scanner(System.in);

        for (String goodName = scanner.nextLine(); !goodName.contains("EXIT"); goodName = scanner.nextLine()) {
            if (goodName.contains("LIST")) {
                printMap(goodsList);
            } else {
                goodsList.put(goodName, goodsList.containsKey(goodName) ? goodsList.get(goodName) + 1 : 1);
            }
        }
        scanner.close();
    }

    private static void printMap(Map<String, Integer> map) {

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
