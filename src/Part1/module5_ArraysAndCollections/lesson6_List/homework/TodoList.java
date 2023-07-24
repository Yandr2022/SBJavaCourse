package Part1.module5_ArraysAndCollections.lesson6_List.homework;


import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        List<String> todoList = new ArrayList<>(){{add("breackfast");add("yoga");add("go to work");}};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one of the commands below:\nLIST - show cases with their sequence numbers\n" +
                "ADD (n) - add a case to the end of the list or a case to place number -n," +
                " moving the rest of the cases forward\nEDIT n - replace case with number -n" +
                "\nDELETE - delete case number -n");
        String command = scanner.nextLine();
//                findInLine("\\s*LIST\\s*|\\s*ADD\\s*(\\d+)?|\\s+(EDIT|DELETE)\\s+\\d+");
        String[] commands = command.split("\\s");

            if (commands.length == 1) {
                switch (commands[0]) {
                    case "LIST":
                        for (int i = 0; i < todoList.size(); i++) {
                            System.out.println(i + ": " + todoList.get(i));
                        }
                        break;
                    case "ADD":
                        System.out.println("Enter case:");
                        String newCase = scanner.nextLine();
                        todoList.add(newCase);
                        System.out.println(todoList);
                        break;
                    default:
                        System.out.println("Wrong command");
                }
            } else {
                int caseNum = Integer.parseInt(commands[1]);
                if (caseNum > todoList.size() - 1 || caseNum < 0) {
                    System.out.println("Wrong case number");
                } else {
                    String newCase;
                    switch (commands[0]) {
                        case "ADD":
                            System.out.println("Enter case:");
                            newCase = scanner.nextLine();
                            todoList.add(caseNum, newCase);
                            System.out.println(todoList);
                            break;
                        case "EDIT":
                            System.out.println("Enter new case:");
                            newCase = scanner.nextLine();
                            todoList.remove(caseNum);
                            todoList.add(caseNum, newCase);
                            System.out.println(todoList);
                            break;
                        case "DELETE":
                            todoList.remove(caseNum);
                            System.out.println(todoList);
                            break;
                    }
                }
            }

        scanner.close();
    }

}
