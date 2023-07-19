package Part1.module4_Numbers_StringsAndDates.lesson22_ConcatString;

public class Demo {
    public static void main(String[] args) {
        String s = "aaa";
        String s1 = "bbb";

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            s+=s1;
        }
        long end = System.currentTimeMillis();
        System.out.println("duration: "+ (end-start));
        System.out.println(s.length());


        StringBuilder builder = new StringBuilder("aaa");
        start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            builder.append(s1);
        }
        end = System.currentTimeMillis();
        System.out.println("duration: "+ (end-start));
        System.out.println(builder.length());

    }


}
