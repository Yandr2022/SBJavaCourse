package Part1.module2_LanguageSyntax.lesson3_Variables;

public class Demo {
    public static void main(String[] args) {
        var num = 2;
        int sqrt = num * num;
        var str = num + " * " + num;
        var str1 = " = ";
        System.out.println(str.concat(str1) + sqrt);
    }

}
