package Part1.module6_inheritanceAndPolymorphism.lesson4_AbstractClasses.figures.abstraction;

import java.awt.*;

public abstract class Figure {
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
   public abstract double getSquare();
}
