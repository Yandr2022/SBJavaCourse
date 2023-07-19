package Part1.module4_Numbers_StringsAndDates.lesson24_25_RegEx.homework.task4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phone = scanner.nextLine();
        showNumberToFormatUseString(phone);
        showNumberToFormatUsePattern(phone);
//        My name is Yuli my tel starts with 80 code - 17, my number - 230, after 85, after 38

        scanner.close();
    }

    static void showNumberToFormatUseString(String text) {
        text = text.replaceAll("[^0-9]", "");
        String msg = "Wrong number!!!";
        if (text.length() == 12 && text.startsWith("375") && (text.startsWith("29", 3)
                || text.startsWith("44", 3) || text.startsWith("33", 3)
                || text.startsWith("17", 3))) {
            msg = String.format("+%s (%s) %s-%s-%s", text.substring(0, 3), text.substring(3, 5), text.substring(5, 8)
                    , text.substring(8, 10), text.substring(10));

        } else if (text.length() == 11 && text.startsWith("80") && (text.startsWith("29", 2)
                || text.startsWith("44", 2) || text.startsWith("33", 2)
                || text.startsWith("17", 2))) {
            msg = String.format("%s (%s) %s-%s-%s", text.substring(0, 1), text.substring(1, 4), text.substring(4, 7)
                    , text.substring(7, 9), text.substring(9));

        }
        System.out.println(msg);
    }

    static void showNumberToFormatUsePattern(String text) {
        text = Pattern.compile("[^0-9]").matcher(text).replaceAll("");
        String msg = "Wrong number";
        if (checkPhoneNumber(text)) {
            boolean isInternationalFormat = text.length() == 12;
            Pattern pattern = Pattern.compile(isInternationalFormat ? "(\\d{3})(\\d{2})(\\d{3})(\\d{2})(\\d{2})"
                    : "(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})");
            msg = pattern.matcher(text).replaceAll(isInternationalFormat ? "+$1 ($2) $3-$4-$5" : "$1 ($2) $3-$4-$5");
        }
        System.out.println(msg);
    }

    private static boolean checkPhoneNumber(String num) {
        return Pattern.matches("(375|80)(29|44|17|33)\\d{7}", num);
    }
}
