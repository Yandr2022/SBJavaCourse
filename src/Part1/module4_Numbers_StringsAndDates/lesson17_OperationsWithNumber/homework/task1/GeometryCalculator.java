package Part1.module4_Numbers_StringsAndDates.lesson17_OperationsWithNumber.homework.task1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class GeometryCalculator {

    public static double getCircleSquare(double radius) {
        return new BigDecimal(Math.PI * Math.pow(radius, 2))
                .setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static double getSphereVolume(double radius) {
        return new BigDecimal((4. / 3) * Math.PI * Math.pow(radius, 3))
                .setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    private static boolean isTriangleRightAngled(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static double getTriangleSquare(double a, double b, double c) {
        double result = -1;
        if (isTriangleRightAngled(a, b, c)) {
            double p = (a + b + c) / 2;
            result = new BigDecimal(Math.sqrt(p * (p - a) * (p - b) * (p - c)))
                    .setScale(2, RoundingMode.HALF_UP).doubleValue();
        }
        return result;
    }
}
