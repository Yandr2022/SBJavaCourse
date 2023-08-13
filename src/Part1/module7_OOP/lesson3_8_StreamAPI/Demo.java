package Part1.module7_OOP.lesson3_8_StreamAPI;

import Part1.module7_OOP.lesson1_2_Lambdas.homework.Employee;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    private static String staffFile = "data/staff.txt";
    private static String dateFormat = "dd.MM.yyyy";

    public static void main(String[] args) {
        ArrayList<Employee> staff = loadStaffFromFile();
//        for (Employee emp : staff) {
//            System.out.println(emp);
//        }
//        staff.forEach(emp->System.out.println(emp));
        staff.forEach(System.out::println);
        staff.forEach(emp -> emp.setSalary(emp.getSalary() + 1000));
        System.out.println("************************************");
        staff.forEach(System.out::println);

        System.out.println("************************************");
        Stream<Employee> employeeStream = staff.stream();
        employeeStream.filter((emp) -> emp.getSalary() >= 100000).forEach(System.out::println);

        System.out.println("************************************");
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        stream.filter(n -> n % 2 == 0).forEach(System.out::print);

        System.out.println("\n************************************");
        int[] salaries = new int[staff.size()];
        for (int i = 0; i < salaries.length; i++) {
            salaries[i] = staff.get(i).getSalary();
        }
        System.out.println(Arrays.stream(salaries).average());

        System.out.println("\n************************************");
        Arrays.stream(salaries).sorted().forEach(System.out::println);

        System.out.println("\n************************************");
        staff.stream().sorted(Comparator.comparing(Employee::getWorkStart)).forEach(System.out::println);

        System.out.println("\n************************************");
        staff.stream().max((e1, e2) -> e2.getWorkStart().compareTo(e1.getWorkStart())).ifPresent(System.out::println);

        System.out.println("\n************************************");
        staff.stream().map(e -> e.getSalary())
                .filter(s -> s >= 100000)
                .reduce((s1, s2) -> s1 + s2)
                .ifPresent(System.out::println);

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

