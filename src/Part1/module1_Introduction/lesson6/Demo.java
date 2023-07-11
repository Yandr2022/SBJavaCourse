package Part1.module1_Introduction.lesson6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {

        DateFormat dateFormat = new SimpleDateFormat("hh:mm a MM/dd/yyyy");
        Date date = new Date();
        System.out.println(dateFormat.format(date));

    }
}
