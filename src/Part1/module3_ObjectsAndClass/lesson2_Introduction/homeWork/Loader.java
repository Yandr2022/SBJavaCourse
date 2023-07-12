package Part1.module3_ObjectsAndClass.lesson2_Introduction.homeWork;

public class Loader {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat);
        killCatUseMeow(cat);
        System.out.println(cat);
        System.out.println("******************************************");
        cat = new Cat();
        System.out.println(cat);
        killCatUseFeed(cat);
        System.out.println(cat);

    }

    static void killCatUseMeow(Cat cat){
        for (double i = cat.getWeight();i>999;i = cat.getWeight()){
            cat.meow();
        }
    }

   static void killCatUseFeed(Cat cat){
        for (double i = cat.getWeight();i<9001;i = cat.getWeight()){
            cat.feed(100.);
            cat.drink(200.);
        }
    }
}
