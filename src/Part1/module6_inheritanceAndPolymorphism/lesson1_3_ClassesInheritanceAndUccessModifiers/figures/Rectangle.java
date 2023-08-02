package Part1.module6_inheritanceAndPolymorphism.lesson1_3_ClassesInheritanceAndUccessModifiers.figures;

import java.util.Date;

public class Rectangle {
   private int width;
   private int height;
   private Date creationTime;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        setCreationTime();
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSquare(){
        return height * width;
    }

    private void setCreationTime(){
        creationTime = new Date();
    }

    public Date getCreationTime() {
        return creationTime;
    }
}
