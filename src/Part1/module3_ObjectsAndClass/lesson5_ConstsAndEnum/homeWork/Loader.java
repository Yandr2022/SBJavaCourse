package Part1.module3_ObjectsAndClass.lesson5_ConstsAndEnum.homeWork;

public class Loader {
    public static void main(String[] args) {

        Cat cat = new Cat(CatColors.MIX);
        Cat cat1 = new Cat(CatColors.BLACK);
        Cat cat2 = new Cat(CatColors.WHITE);
        System.out.println(cat);
        System.out.println(cat1);
        System.out.println(cat2);

    }

}
