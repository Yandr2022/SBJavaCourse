package Part1.module4_Numbers_StringsAndDates.lesson4_Boxing_Unboxing.homework;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.count += 7843;
        System.out.println(container.count);

        System.out.println(sumDigits(15));


    }

    public static Integer sumDigits(Integer number) {
        String s = Integer.toString(number);
        int sum;
        for (int i = sum = 0; i < s.length(); i++) {
            sum += Integer.parseInt(s.charAt(i) + "");
        }
        return sum;
    }
}

