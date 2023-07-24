package Part1.module5_ArraysAndCollections.lesson6_List.homework;


import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TodoList {
    public static void main(String[] args) {
        List<String> todoList = new ArrayList<>() {{
            add("breackfast");
            add("yoga");
            add("go to work");
        }};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one of the commands below:\nLIST - show cases with their sequence numbers\n" +
                "ADD (n) - add a case to the end of the list or a case to place number -n," +
                " moving the rest of the cases forward\nEDIT n - replace case with number -n" +
                "\nDELETE - delete case number -n");


        String[] commands;
        for (String userInput = scanner.nextLine(); !userInput.contains("EXIT"); userInput = scanner.nextLine()) {
            commands = userInput.split("\\s+");
            if (commands.length == 0) {
                System.out.println("Try again");
                continue;
            } else {
                switch (commands[0]) {
                    case "LIST":
                        for (int i = 0; i < todoList.size(); i++) {
                            System.out.println(i + ": " + todoList.get(i));
                        }
                        break;
                    case "ADD":
                        if (commands.length > 1) {
                            StringBuilder builder = new StringBuilder();
                            if (Character.isDigit(commands[1].charAt(0))) {
                                Matcher matcher = Pattern.compile("\\d+").matcher(commands[1]);
                                matcher.find();
                                int index = Integer.parseInt(matcher.group());
                                if (index < commands.length - 1 && index >= 0) {
                                    for (int i = 2; i < commands.length; i++) {
                                        builder.append(commands[i]).append(" ");
                                    }
                                    todoList.add(index, builder.toString());
                                } else {
                                    System.out.println("Try again");
                                }
                            } else {
                                for (int i = 1; i < commands.length; i++) {
                                    builder.append(commands[i]).append(" ");
                                }
                                todoList.add(builder.toString());
                            }
                        } else {
                            System.out.println("Try again");
                        }
                        break;
                    case "EDIT":
                        if (commands.length > 1 && Character.isDigit(commands[1].charAt(0))) {
                            StringBuilder builder = new StringBuilder();
                            Matcher matcher = Pattern.compile("\\d+").matcher(commands[1]);
                            matcher.find();
                            int index = Integer.parseInt(matcher.group());
                            todoList.remove(index);
                            for (int i = 2; i < commands.length; i++) {
                                builder.append(commands[i]).append(" ");
                            }
                            todoList.add(index, builder.toString());
                        } else {
                            System.out.println("Try again");
                        }
                        break;
                    case "DELETE":
                        if (commands.length > 1 && Character.isDigit(commands[1].charAt(0))) {
                            Matcher matcher = Pattern.compile("\\d+").matcher(commands[1]);
                            matcher.find();
                            int index = Integer.parseInt(matcher.group());
                            todoList.remove(index);
                        } else {
                            System.out.println("Try again");
                        }
                }

            }

        }

        scanner.close();
    }


}

