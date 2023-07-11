package Part1.module2_LanguageSyntax.lesson4_Boolean_ComparisonAndConditionalOperators;


public class CoffeMachineExample {

    public static void main(String[] args) {
        int moneyAmount = 100;

        int cappuccinoPrice = 180;
        int lattePrice = 120;
        int espressoPrice = 80;
        int waterPrice = 20;

        boolean isMilkEnough = true;
        boolean canBuyAnything = false;

        if (moneyAmount >= cappuccinoPrice && isMilkEnough) {
            System.out.println("You can buy cappuccino");
            canBuyAnything = true;
        }

        if (moneyAmount >= lattePrice && isMilkEnough) {
            System.out.println("You can buy latte");
            canBuyAnything = true;
        }

        if (moneyAmount >= espressoPrice) {
            System.out.println("You can buy espresso");
            canBuyAnything = true;
        }

        if (moneyAmount >= waterPrice ) {
            System.out.println("You can buy water");
            canBuyAnything = true;
        }

            System.out.println(canBuyAnything?"Choose your drink":"You can not buy anything");



    }


}

