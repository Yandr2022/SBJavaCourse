package Part1.module6_inheritanceAndPolymorphism.lesson1_ClassesInheritance.figures;

public class Square extends Rectangle {
    public Square(int width) {
        super(width, width);
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        height = width;
    }

    @Override
    public void setHeight(int height) {
        width = height;
        this.height = height;
    }
}
