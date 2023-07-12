package Part1.module2_LanguageSyntax.lesson5_Loops.homeWork;

public class Task1 {
    public static void main(String[] args) {

        for (int i = 200_000; i <= 210_000; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n************************************");

        int i = 210_000;
        while (i <= 220_000) {
            System.out.print(i + " ");
            i++;
        }
    }
}
