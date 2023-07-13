package Part1.module3_ObjectsAndClass.lesson8_ObjectCopying.homeWork;

public class Loader {
    public static void main(String[] args) {

        Cat cat = new Cat("Murka",1500,CatColors.WHITE);
        Cat cat1 = cat;
        cat.feed(200.);
        cat.drink(100.);
        cat.pee();
        System.out.println(cat);
        System.out.println(cat1);
        System.out.println("*****************************");

        cat1.setColor(CatColors.BLACK);
        System.out.println(cat);
        System.out.println(cat1);
        System.out.println("*****************************");

        cat1 = cat.getCopy();
        Cat cat2 = cat.getFullCopy();
        cat1.setName("Boris");
        cat2.setName("Fedor");
        System.out.println(cat);
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println("*****************************");

        System.out.println(Cat.getCount());



    }

}
