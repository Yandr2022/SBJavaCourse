package Part1.module5_ArraysAndCollections.lesson9_11_HashMap_TreeMap.homework;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class Demo {

    public static void main(String[] args) {
        TreeMap<String, String> phoneBook = new TreeMap<>() {{
        }};//sorted by key (alphabetic)

        Scanner scanner = new Scanner(System.in);

        for (String userInput = scanner.nextLine(), temp, name; !userInput.contains("EXIT"); userInput = scanner.nextLine()) {
            if (userInput.contains("LIST")) {
                printMap(phoneBook);
            } else if (checkPhoneNumber((temp = userInput.replaceAll("[^0-9]", "")))) {

                if (phoneBook.containsKey(temp)) {
                    System.out.println(phoneBook.get(temp));
                } else {
                    System.out.println("Input name for add new contact");
                    name = scanner.nextLine();
                    phoneBook.put(temp, name.trim());
                }
            } else {
                if(phoneBook.containsValue(userInput.trim())){
                    for (String key : phoneBook.keySet()) {
                        if (phoneBook.get(key).equals(userInput.trim()))
                        System.out.print(key + " ");
                    }
                }else{
                    System.out.println("Input phone for add new contact");
                    temp = scanner.nextLine().replaceAll("[^0-9]", "");
                    if(checkPhoneNumber(temp)){
                        phoneBook.put(temp,userInput.trim());
                    }else {
                        System.out.println("Wrong phone number, try again");
                    }
                }
            }
        }
        scanner.close();
    }

    private static void printMap(Map<String, String> map) {

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }

    private static boolean checkPhoneNumber(String num) {
        return Pattern.matches("(375|80)(29|44|17|33|25)\\d{7}", num);
    }
}
