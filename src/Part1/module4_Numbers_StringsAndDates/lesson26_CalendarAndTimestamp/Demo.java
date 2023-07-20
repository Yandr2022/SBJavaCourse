package Part1.module4_Numbers_StringsAndDates.lesson26_CalendarAndTimestamp;

import java.util.Calendar;

public class Demo {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        calendar.add(Calendar.MONTH, 2);
        System.out.println(calendar.getTime());

        calendar = Calendar.getInstance();
        long timestamp = calendar.getTimeInMillis();
        long timestamp1 = calendar.getTime().getTime();
        System.out.println(timestamp);
        System.out.println(timestamp1);
        System.out.println(System.currentTimeMillis());

    }
}
