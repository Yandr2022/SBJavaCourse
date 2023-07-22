package Part1.module5_ArraysAndCollections.lesson6_List;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>();
        todoList.add("first task");
        todoList.add("second task");
        todoList.add("thirst task");

        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(todoList.get(i));

        }
        System.out.println("*********************");

        todoList.add(1, "new second task");
        todoList.remove(2);

        for (String task : todoList) {
            System.out.println(task);

        }
        System.out.println("*********************");

        ArrayList<String> todoList1 = new ArrayList<>() {{
            add("first task");
            add("second task");
            add("thirst task");
        }};

        for (String task : todoList1) {
            System.out.println(task);

        }
    }
}
