package Part1.module1_Introduction.lesson6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HomeWork {
    public static void main(String[] args) {

        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        Date date = new Date();
        System.out.println(dateFormat.format(date));

    }
}
