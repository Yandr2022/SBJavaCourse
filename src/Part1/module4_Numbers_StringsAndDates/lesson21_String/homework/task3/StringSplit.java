package Part1.module4_Numbers_StringsAndDates.lesson21_String.homework.task3;


import java.util.Arrays;
import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your surname name patronymic");
        String text = scanner.nextLine();
        showSeparatedLFMNamesRegEX(text);
        showSeparatedLFMNamesHardCode(text);
        scanner.close();
    }

    static void showSeparatedLFMNamesRegEX(String str) {
        String[] sepNames = str.split("\\s");
        if (sepNames.length == 3) {
            System.out.printf("Surname: %s\nFirstname: %s\nMiddleName: %s\n", sepNames[0], sepNames[1], sepNames[2]);
        } else {
            System.out.println("Wrong data");
        }
    }

    static void showSeparatedLFMNamesHardCode(String str) {
        String[] names = new String[3];
        String msg = "Wrong data";
        int j = 0;
        str = str.trim();
        for (int i = str.indexOf(' '); i != -1; i = str.indexOf(' ')) {
            if (j < names.length) {
                names[j++] = str.substring(0, i);
                str = str.substring(++i);
            } else {
                break;
            }
        }
        msg = j == 2 ? String.format("Surname: %s\nFirstname: %s\nMiddleName: %s", names[0], names[1], names[2]) : msg;
        System.out.println(msg);

    }

}
