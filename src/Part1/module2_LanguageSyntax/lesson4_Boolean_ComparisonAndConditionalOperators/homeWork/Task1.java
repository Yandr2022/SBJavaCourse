package Part1.module2_LanguageSyntax.lesson4_Boolean_ComparisonAndConditionalOperators.homeWork;

public class Task1 {
    public static void main(String[] args) {
        int milkAmount = 1300; // ml
        int powderAmount = 500; // g
        int eggsCount = 5; // items
        int sugarAmount = 20; // g
        int oilAmount = 30; // ml
        int appleCount = 8;// items

        boolean canCookAnything = false;

        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if (milkAmount >= 1000 && sugarAmount >= 10 && powderAmount >= 400 && oilAmount >= 30) {
            System.out.println("Pancakes");
            canCookAnything = true;
        }

        //milk - 300 ml, powder - 5 g, eggs - 5
        if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
            System.out.println("Omelette");
            canCookAnything = true;
        }

        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        if (milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4 && appleCount >= 3) {
            System.out.println("Apple pie");
            canCookAnything = true;
        }

        if (!canCookAnything) {
            System.out.println("can't cook anything");
        }
    }
}
