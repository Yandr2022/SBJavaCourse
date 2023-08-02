package Part1.module6_inheritanceAndPolymorphism.lesson1_3_ClassesInheritanceAndUccessModifiers.figures;

public class Square extends Rectangle {
    public Square(int width) {
        super(width, width);
    }

    @Override
    public void setWidth(int width) {
        setWidth(width) ;
        setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        setWidth(height);
        setHeight(height);
    }
}
