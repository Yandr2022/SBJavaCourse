package Part1.module7_OOP.lesson1_2_Lambdas.homework;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    private static String staffFile = "data/staff.txt";
    private static String dateFormat = "dd.MM.yyyy";

    public static void main(String[] args) {
        ArrayList<Employee> staff = loadStaffFromFile();
        staff.sort(((o1, o2) -> o1.getSalary() - o2.getSalary() == 0 ? o1.getName().compareTo(o2.getName())
                : o1.getSalary() - o2.getSalary()));
        for (Employee emp : staff) {
            System.out.println(emp);
        }


    }

    public static ArrayList<Employee> loadStaffFromFile() {
        ArrayList<Employee> staff = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(staffFile));
            for (String line : lines) {
                String[] fragments = line.split("\t");
                if (fragments.length != 3) {
                    System.out.println("Wrong line: " + line);
                    continue;
                }
                staff.add(new Employee(
                        fragments[0],
                        Integer.parseInt(fragments[1]),
                        (new SimpleDateFormat(dateFormat)).parse(fragments[2])
                ));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return staff;
    }
}

