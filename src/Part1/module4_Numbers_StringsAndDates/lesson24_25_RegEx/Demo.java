package Part1.module4_Numbers_StringsAndDates.lesson24_25_RegEx;

public class Demo {

    public static void main(String[] args) {

        String phone = "+7 (905) 123-4567";
        System.out.println(phone.replaceAll("[^0-9]",""));//replace all characters with empty string except numbers

        String text = "AT the end of a little Swedish town lay an old, overgrown orchard. In the orchard was a cottage," +
                " and in this cottage lived Pippi Longstocking. She was nine years old, and she lived all alone. She had " +
                "neither mother nor father, which was really rather nice, for in this way there was no one to tell her to " +
                "go to bed just when she was having most fun, and no one to make her take cod-liver-oil when she felt " +
                "like eating peppermints.";
        String[] strings = text.split("\\.\\s*");
        for (String s:strings) {
            System.out.println(s);
        }

    }
}
