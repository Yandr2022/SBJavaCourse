package Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.figures.abstraction;

import java.awt.*;

public abstract class Figure2D implements Figure{
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public abstract double getSquare();
}
