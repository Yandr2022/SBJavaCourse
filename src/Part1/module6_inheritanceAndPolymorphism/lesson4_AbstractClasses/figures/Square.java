package Part1.module6_inheritanceAndPolymorphism.lesson4_AbstractClasses.figures;

public class Square extends Rectangle {
    public Square(double width) {
        super(width, width);
    }

    @Override
    public void setWidth(double width) {
        setWidth(width) ;
        setHeight(width);
    }

    @Override
    public void setHeight(double height) {
        setWidth(height);
        setHeight(height);
    }
}
