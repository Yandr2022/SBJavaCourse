package Part1.module7_OOP.lesson3_8_StreamAPI.homework;

import Part1.module7_OOP.lesson1_2_Lambdas.homework.Employee;
import Part1.module7_OOP.lesson3_8_StreamAPI.Demo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;


public class Task1 {
    public static void main(String[] args) {

        ArrayList<Employee> staff = Demo.loadStaffFromFile();

        Calendar start = Calendar.getInstance();
        start.set(2016, Calendar.DECEMBER, 31);

        Calendar end = Calendar.getInstance();
        end.set(2018, Calendar.JANUARY, 1);

        staff.stream().filter(e -> e.getWorkStart().before(end.getTime())
                        && e.getWorkStart().after(start.getTime())).max(Comparator.comparing(Employee::getSalary))
                .ifPresent(System.out::println);
    }

}
