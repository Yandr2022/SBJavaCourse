package Part1.module5_ArraysAndCollections.lesson12_searchingAndSorting.homework;

import java.util.*;

public class Demo {
    public static final String CAR_NUMBER_REGEX = "^\\w\\d{3}\\w{2}\\d{1,3}$";

    public static void main(String[] args) {

        ArrayList<String> carNumbers = new ArrayList<>();
        String[] carNumberChar = new String[]{"A", "B", "E", "K", "M", "H", "O", "P", "C", "T", "Y", "X"};
        for (int c = 0; c < carNumberChar.length; ++c) {
            for (int region = 1; region <= 199; ++region) {
                for (int num = 1; num < 10; num++) {
                    String character = carNumberChar[c];
                    String carNumber = String.format("%s%d%d%d%s%s%d", character, num, num, num, character, character, region);
                    carNumbers.add(carNumber);
                }
            }
        }
        System.out.println(carNumbers.size());

        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Введите номер автомобиля для поиска: ");
            String inputCarNumber = scanner.nextLine();
            if (inputCarNumber.matches(CAR_NUMBER_REGEX)) {
                long start = System.nanoTime();
                carNumbers.contains(inputCarNumber);
                long duration = System.nanoTime() - start;
                System.out.println("Время поиска прямым перебором: " + duration);

                start = System.nanoTime();
                Collections.binarySearch(carNumbers, inputCarNumber);
                duration = System.nanoTime() - start;
                System.out.println("Время бинарного поиска: " + duration);

                HashSet<String> hashCarNumbers = new HashSet<>();
                hashCarNumbers.addAll(carNumbers);

                start = System.nanoTime();
                hashCarNumbers.contains(inputCarNumber);
                duration = System.nanoTime() - start;
                System.out.println("Время поиска с помощью HashSet: " + duration);

                TreeSet<String> treeCarNumbers = new TreeSet<>();
                treeCarNumbers.addAll(carNumbers);

                start = System.nanoTime();
                treeCarNumbers.contains(inputCarNumber);
                duration = System.nanoTime() - start;
                System.out.println("Время поиска с помощью TreeSet: " + duration);
            } else {
                System.out.println("Неверный формат номера");
            }


        }
    }

    private static void getCarNumbers(List<String> box) {

    }
}
