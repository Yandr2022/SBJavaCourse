package Part1.module4_Numbers_StringsAndDates.lesson21_String.homework.task1;

public class LetterToUniCode {
    public static void main(String[] args) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char c, cUp;
        for (int i = 0; i < alphabet.length(); i++) {
            c = alphabet.charAt(i);
            cUp = ((char) ((int) c & 65503));
            System.out.printf("%s-%s: %04X-%04X\n", c, cUp, ((int) c), ((int) cUp));
        }

        System.out.println("*****************");

        alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        for (int i = 0; i < alphabet.length(); i++) {
            c = alphabet.charAt(i);
            cUp = Character.toUpperCase(c);
            System.out.printf("%s-%s: %04X-%04X\n", c, cUp, ((int) c), ((int) cUp));
        }

    }
}
