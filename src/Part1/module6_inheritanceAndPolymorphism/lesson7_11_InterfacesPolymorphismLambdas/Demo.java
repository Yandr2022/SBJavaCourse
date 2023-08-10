package Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas;

import Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.figures.Circle;
import Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.figures.Square;
import Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.figures.abstraction.Figure;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Figure>figures = new ArrayList<>(){{add(new Circle(67));add(new Square(25));}};
        for (Figure f:figures
             ) {
            System.out.println(f.getVisibleHeight());
        }
    }
}
