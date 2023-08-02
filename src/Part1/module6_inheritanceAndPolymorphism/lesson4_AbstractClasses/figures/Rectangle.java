package Part1.module6_inheritanceAndPolymorphism.lesson4_AbstractClasses.figures;

import Part1.module6_inheritanceAndPolymorphism.lesson4_AbstractClasses.figures.abstraction.Figure;

import java.util.Date;

public class Rectangle extends Figure {
   private double width;
   private double height;
   private Date creationTime;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        setCreationTime();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getSquare(){
        return height * width;
    }

    private void setCreationTime(){
        creationTime = new Date();
    }

    public Date getCreationTime() {
        return creationTime;
    }

}
