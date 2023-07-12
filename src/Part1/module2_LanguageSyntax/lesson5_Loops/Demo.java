package Part1.module2_LanguageSyntax.lesson5_Loops;

public class Demo {
    public static void main(String[] args) {

        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            System.out.printf("%02d: %-6s\t\t%02d: %s\n", i, arr[i], j, arr[j]);
        }
        System.out.println("**************************");

        int i = 10;
        int j = i++;
        System.out.printf("%-20s j = i++: j = %s, i = %s\n", "Postfix increment", j, i);

        i = 10;
        j = ++i;
        System.out.printf("%-20s j = ++i: j = %d, i = %d\n", "Prefix increment", j, i);

        i = 10;
        j = i--;
        System.out.printf("%-20s j = i--: j = %d, i = %02d\n", "Postfix decrement", j, i);

        i = 10;
        j = --i;
        System.out.printf("%-20s j = --i: j = %02d, i = %02d\n", "Prefix decrement", j, i);

    }
}
