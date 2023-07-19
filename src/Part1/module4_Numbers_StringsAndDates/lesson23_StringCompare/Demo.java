package Part1.module4_Numbers_StringsAndDates.lesson23_StringCompare;

public class Demo {

    public static void main(String[] args) {
        String name = "Yuli";
        String nameCopy = "Yuli";
        String name1 = "Ivan";

        System.out.println(name == nameCopy);//reference comparison, true - because string values are stored in String pool
        System.out.println(name == new String(name));//reference comparison
        System.out.println(name == name1);//reference comparison
        System.out.println("*****************************");
        System.out.println(name.equals(nameCopy));
        System.out.println(name.equals(name1));
        System.out.println("_____________________________");
        System.out.println(name.equalsIgnoreCase("yuli"));
        System.out.println(name.equals("yuli"));
        System.out.println("*****************************");
        System.out.println("abc".compareTo("fgh"));//0 - equals; <0 - string is lexicographically less than argument;
        System.out.println("def".compareTo("abc"));//>0 - string is lexicographically greater than argument.
        System.out.println("abc".compareToIgnoreCase("ABc"));

    }
}
