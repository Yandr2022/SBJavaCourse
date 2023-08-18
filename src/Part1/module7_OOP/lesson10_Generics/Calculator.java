package Part1.module7_OOP.lesson10_Generics;

import java.util.List;

public class Calculator {

    public static double sum(List<? extends Number> numbers) {
        return numbers.stream().map(number -> ((Number) number)
                .doubleValue()).reduce((n1, n2) -> n1 + n2).get();
    }
}
