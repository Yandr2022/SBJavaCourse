package Part1.module4_Numbers_StringsAndDates.lesson21_String.homework.task3;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your surname name patronymic");
        String text = scanner.nextLine();
        showSeparatedLFMNames(text);

    }

    static void showSeparatedLFMNames(String str) {
        String[] sepNames = str.split("(\\s)");
        if (sepNames.length == 3) {
            System.out.printf("Surname: %s\nFirstname: %s\nMiddleName: %s", sepNames[0], sepNames[1], sepNames[2]);
        } else {
            System.out.println("Wrong data");
        }
    }

}
