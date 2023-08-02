package Part1.module6_inheritanceAndPolymorphism.lesson4_AbstractClasses.figures;

import Part1.module6_inheritanceAndPolymorphism.lesson4_AbstractClasses.figures.abstraction.Figure;

public class Circle extends Figure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }
}
