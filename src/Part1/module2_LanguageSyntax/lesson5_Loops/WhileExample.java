package Part1.module2_LanguageSyntax.lesson5_Loops;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        int secretPinCode = 7567;
        int pinCode = -1;

        Scanner scanner = new Scanner(System.in);
        while (pinCode != secretPinCode) {
            if (pinCode == -1) {
                System.out.println("Введите пароль:");
            } else {
                System.out.println("Пароль введён неверно. Введите верный пароль:");
            }
            pinCode = scanner.nextInt();
        }

        System.out.println("Пароль введён верно!!!");
    }
}
