package Part1.module4_Numbers_StringsAndDates.lesson21_String.homework.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExperiments {

    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        System.out.println("Friends' earning: " + getDigitsSumFromStringUsingStringMethods(text));
        System.out.println("Friends' earning: " + getDigitsSumFromStringUsingRegEx(text));

    }

    static int getDigitsSumFromStringUsingStringMethods(String text) {
        int sum = 0;
        text = text.trim();
        for (int i = text.indexOf(' '), endDigit; i != -1; i = text.indexOf(' ')) {
            text = text.substring(i).trim();
            if (Character.isDigit(text.charAt(0))) {
                endDigit = text.indexOf(' ');
                sum += Integer.parseInt(text.substring(0, endDigit == -1 ? text.length() : endDigit));
            }
        }
        return sum;
    }

    static int getDigitsSumFromStringUsingRegEx(String text) {
        int sum = 0;
        text = text.trim();
        Matcher matcher = Pattern.compile("\\d+").matcher(text);
        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }
        return sum;
    }
}

