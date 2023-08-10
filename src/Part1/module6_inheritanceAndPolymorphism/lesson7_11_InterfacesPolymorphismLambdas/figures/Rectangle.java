package Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.figures;


import Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.figures.abstraction.Figure2D;

import java.util.Date;

public class Rectangle extends Figure2D {
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

    @Override
    public double getVisibleHeight() {
        return 0;
    }

    @Override
    public double getVisibleWidth() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", creationTime=" + creationTime +
                "} ";
    }
}
