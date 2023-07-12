package Part1.module3_ObjectsAndClass.lesson3_Methods.homeWork;

public class Loader {
    public static void main(String[] args) {
        
        Cat cat = new Cat();
        System.out.println(cat);
        cat.drink(200.);
        cat.feed(100.);
        System.out.println(cat);
        cat.goToToilet();
        System.out.println(cat);
        cat.goToToilet();

    }

}
