package Part1.module4_Numbers_StringsAndDates.lesson21_String.homework.task4;

public class SearchAndReplace {
    public static void main(String[] args) {

        searchAndReplaceDiamonds("number of credit cards: <1234 5678 9012> 1234, name: Yuli", "****");
    }

    static void searchAndReplaceDiamonds(String text, String placeholder) {
        String replace = text.substring(text.indexOf('<') + 1, text.indexOf('>'));
        replace = text.replace(replace, placeholder);
        System.out.println(replace);
    }
}
