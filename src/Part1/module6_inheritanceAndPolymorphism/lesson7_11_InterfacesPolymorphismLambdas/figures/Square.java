package Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.figures;

public class Square extends Rectangle implements Comparable<Square> {
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
    @Override
    public int compareTo(Square square) {
        return Double.compare(getWidth(), square.getWidth());
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + getWidth() +
                ", creationTime=" + getCreationTime() +
                "} ";
    }
}
