package Part1.module4_Numbers_StringsAndDates.lesson26_CalendarAndTimestamp.homework;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class BirthdaysParsing {

    public static void main(String[] args) {

        int day = 30;
        int month = Calendar.NOVEMBER;
        int year = 1987;

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);

        DateFormat format = new SimpleDateFormat("dd.MM.yyyy - EEE");
        DateFormat format1 = new SimpleDateFormat("dd.MM.yyyy - EEE", Locale.ENGLISH);

        Date currentDate = Calendar.getInstance().getTime();
        for (int age = 0; calendar.getTime().before(currentDate); age++) {
            System.out.printf("%03d: %s; %s\n", age, format.format(calendar.getTime()), format1.format(calendar.getTime()));
            calendar.add(Calendar.YEAR, 1);
        }


    }
}
