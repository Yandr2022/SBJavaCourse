package Part1.module5_ArraysAndCollections.lesson8_Set.homework;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class EmailBox {

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
        String[] toWords;

        while (!userInput.contains("EXIT")){
            toWords = userInput.split("\\s+");
            if (toWords.length == 1 && toWords[0].equals("LIST")){
                for (String s:set) {
                    System.out.println(s);
                }
            } else if (toWords.length == 2 && toWords[0].equals("ADD") && toWords[1].matches("\\w+@\\w+\\.\\w+")) {
                String email = toWords[1];
                if (set.contains(email)){
                    System.out.println("This email already exists");
                }else{
                    set.add(email);
                }
            }else {
                System.out.println("Try again");

            }
            userInput = scanner.nextLine();
        }
        scanner.close();
    }
}
