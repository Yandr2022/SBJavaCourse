package Part1.module4_Numbers_StringsAndDates.lesson13_Numbers.homework;

public class Demo {

    public static void main(String[] args) {
        Number[] numbers = {Byte.MIN_VALUE, Byte.MAX_VALUE, Byte.BYTES, Short.MIN_VALUE,
                Short.MAX_VALUE, Short.BYTES, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.BYTES, Long.MIN_VALUE
                , Long.MAX_VALUE, Long.BYTES, Float.MIN_VALUE, Float.MAX_VALUE, Float.BYTES, Double.MIN_VALUE
                , Double.MAX_VALUE, Double.BYTES};

        for (int i = 0; i < numbers.length; i += 3) {
            System.out.printf(i < 12 ? ("%s: %d byte\nmin value: %d\nmax value: %d\n")
                            : ("%s: %d byte\nmin value: %.2f\nmax value: %3e\n")
                    , numbers[i].getClass().getSimpleName(), numbers[i + 2], numbers[i], numbers[i + 1]);
            System.out.println("----------------------------------");
        }
    }
}
