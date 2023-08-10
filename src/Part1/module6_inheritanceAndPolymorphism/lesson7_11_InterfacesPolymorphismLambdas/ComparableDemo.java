package Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas;

import Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.figures.Circle;
import Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.figures.CircleComparator;
import Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.figures.Square;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ComparableDemo {

    public static void main(String[] args) {
        String s = "a";
        String s1 = "b";
        System.out.println(s.compareTo(s1));
        System.out.println(s.compareTo("a"));
        System.out.println("*****************");
        TreeSet<Square> squares = new TreeSet<>() {{
            add(new Square(20));
            add(new Square(50));
            add(new Square(20));
            add(new Square(70));
        }};
        System.out.println(squares);

        System.out.println("*****************");
        TreeSet<Circle> circles = new TreeSet<>(new CircleComparator()) {{
            add(new Circle(20));
            add(new Circle(50));
            add(new Circle(20));
            add(new Circle(70));
        }};
        for (Circle c : circles
        ) {
            System.out.println(c.getRadius());
        }
        System.out.println("*****************");
        List<Circle> circleList = new ArrayList<>(circles);
        circleList.sort(new Comparator<Circle>() {
            @Override
            public int compare(Circle o1, Circle o2) {
                return Double.compare(o1.getRadius(), o2.getRadius());
            }
        });
        for (Circle c : circleList
        ) {
            System.out.println(c.getRadius());
        }
        System.out.println("*****************");
        circleList.sort((o1, o2) -> Double.compare(o2.getRadius(), o1.getRadius()));
        for (Circle c : circleList
        ) {
            System.out.println(c.getRadius());
        }
    }
}
