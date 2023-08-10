package Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.figures;

import Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.figures.abstraction.Figure2D;

public class Circle extends Figure2D {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

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

    @Override
    public double getVisibleHeight() {
        return 0;
    }

    @Override
    public double getVisibleWidth() {
        return 0;
    }
}
