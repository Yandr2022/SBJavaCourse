package Part1.module2_LanguageSyntax.lesson4_Boolean_ComparisonAndConditionalOperators.homeWork;

public class Task2 {
    public static void main(String[] args) {

        int elenaAge = 29;
        int olegAge = 15;
        int maximAge = 32;

        int middleAge;
        int minAge;
        int maxAge;

        if (elenaAge > olegAge && elenaAge > maximAge) {

            maxAge = elenaAge;

            if (olegAge > maximAge) {
                middleAge = olegAge;
                minAge = maximAge;
            } else {
                middleAge = maximAge;
                minAge = olegAge;
            }

        } else if (olegAge > maximAge && olegAge > elenaAge) {

            maxAge = olegAge;

            if (elenaAge > maximAge) {
                middleAge = elenaAge;
                minAge = maximAge;
            } else {
                middleAge = maximAge;
                minAge = elenaAge;
            }

        } else {

            maxAge = maximAge;

            if (elenaAge > olegAge) {
                middleAge = elenaAge;
                minAge = olegAge;
            } else {
                middleAge = olegAge;
                minAge = elenaAge;
            }

        }

        System.out.printf("%-8s: %d\n", "min", minAge);
        System.out.printf("%-8s: %d\n", "middle", middleAge);
        System.out.printf("%-8s: %d\n", "max", maxAge);
    }
}
