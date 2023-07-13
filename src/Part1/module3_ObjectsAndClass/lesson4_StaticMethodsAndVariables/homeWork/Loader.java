package Part1.module3_ObjectsAndClass.lesson4_StaticMethodsAndVariables.homeWork;

public class Loader {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat);
        System.out.println(Cat.getCount());
        killCatUseMeow(cat);
        System.out.println(cat);
        cat.drink(50.);
        cat.feed(70.);
        cat.meow();
        System.out.println(Cat.getCount());
        System.out.println("******************************************");
        System.out.println(cat1);
        killCatUseFeed(cat1);
        System.out.println(cat1);
        cat1.drink(50.);
        cat1.feed(70.);
        cat1.meow();
        System.out.println(Cat.getCount());


    }

    static void killCatUseMeow(Cat cat){

        while (!cat.getStatus().equals("Dead")){
            cat.meow();
        }

    }

   static void killCatUseFeed(Cat cat){

        while(!cat.getStatus().equals("Exploded")){
            cat.feed(100.);
            cat.drink(200.);
        }

    }
}
