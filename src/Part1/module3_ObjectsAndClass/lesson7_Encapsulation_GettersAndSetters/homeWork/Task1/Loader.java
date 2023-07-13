package Part1.module3_ObjectsAndClass.lesson7_Encapsulation_GettersAndSetters.homeWork.Task1;

public class Loader {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Cat cat1 = new Cat();
        cat.setColor(CatColors.BLACK);
        System.out.println(cat);
        System.out.println(cat1);
        cat1.setColor(CatColors.WHITE);
        System.out.println(cat1.getColor());
        System.out.println(cat1);

    }

}
