package Part1.module2_LanguageSyntax.lesson4_Boolean_ComparisonAndConditionalOperators.myVariante;

import java.util.Arrays;
import java.util.Scanner;


public class CoffeMachine {

    static int milkAmount = 1;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money do you have?");
        int moneyAmount = scanner.nextInt();

        Drink[] drinks = {new Drink("latte", 120,3), new Drink("espresso", 80,0)
                , new Drink("raf", 220,2), new Drink("cappuccino", 180,2)
                , new Drink("cacao", 100,2), new Drink("water", 20,0)
                , new Drink("americano", 110,1)};
        Arrays.sort(drinks);

        System.out.println("List of available drinks:");

        Drink[] availableDrinks = getAvailableDrinks(drinks, moneyAmount);
        if (availableDrinks.length == 0) {
            System.out.println("No drinks available");
        } else {
            for (Drink d : availableDrinks) {
                if(d.getMilkContains()<=milkAmount) {
                    System.out.printf("%-15s\t%s\n", d.getName(), d.getPrice());
                }
            }
        }

    }

    private static int definePriceLimit(Drink[] drinks, int money) {
        int limit = -1;
        for (int i = 0; i < drinks.length; i++) {
            if (money >= drinks[i].getPrice()) {
                limit = i;
                break;
            }
        }
        return limit;
    }

    static Drink[] getAvailableDrinks(Drink[] drinks, int money) {
        int start = definePriceLimit(drinks, money);
        Drink[] availableDrinks;
        if (start >= 0) {
            availableDrinks = new Drink[drinks.length - start];
            for (int i = 0; i < availableDrinks.length; i++) {
                availableDrinks[i] = drinks[start + i];
            }
        } else {
            availableDrinks = new Drink[0];
        }
        return availableDrinks;
    }


}

