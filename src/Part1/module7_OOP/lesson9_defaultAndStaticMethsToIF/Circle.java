package Part1.module7_OOP.lesson9_defaultAndStaticMethsToIF;

public class Circle implements Figure2D{
    @Override
    public double getSquare() {
        return Figure2D.super.getSquare();
    }
}
