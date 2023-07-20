package Part1.module4_Numbers_StringsAndDates.lesson21_String.homework.task4;

import java.util.regex.Pattern;

public class SearchAndReplace {
    public static void main(String[] args) {

        searchAndReplaceDiamonds("number of credit cards: <1234 5678 9012> 1234 , name: Yuli", "****");
        searchAndReplaceDiamondsRegEx("number of credit cards: <1234 5678 9012> 1234 , name: Yuli", "****");
        searchAndReplaceDiamondsRegEx
                ("number of credit cards: < i dont wont say my card number, maybe 1234> 1234<1234>, name: Yuli"
                        , "****");
        searchAndReplaceDiamondsRegEx
                ("number of credit cards: < не скажу я Вам свой  номер карты, может быть 1234 > 1234 <1234> <>, name: Yuli"
                        , "****");
    }

    static void searchAndReplaceDiamonds(String text, String placeholder) {
        String replace = text.substring(text.indexOf('<') + 1, text.indexOf('>'));
        replace = text.replace(replace, placeholder);
        System.out.println(replace);
    }
    static void searchAndReplaceDiamondsRegEx(String text, String placeholder) {
        String replace = Pattern.compile("<[^>]*>").matcher(text).replaceAll(placeholder);
        System.out.println(replace);
    }
}
