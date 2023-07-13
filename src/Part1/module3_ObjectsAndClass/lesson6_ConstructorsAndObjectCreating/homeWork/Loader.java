package Part1.module3_ObjectsAndClass.lesson6_ConstructorsAndObjectCreating.homeWork;

public class Loader {
    public static void main(String[] args) {
        Cat cat = getCat();
        System.out.println(cat);
        Cat cat1 = getCat();
        System.out.println(cat1);
        Cat cat2 = getCat();
        System.out.println(cat2);
        Cat cat3 = new Cat();
        System.out.println(cat3);
        System.out.println(Cat.getCount());

    }

    public static Cat getCat() {
        return new Cat(1500);
    }

}
