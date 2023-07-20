package Part1.module5_ArraysAndCollections.lesson2_3_iterateOverArrayElements;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {

        int ticketNumbers[] = new int[1000];
        int winTickets[] = new int[10];

        for (int i = 0; i < ticketNumbers.length; i++) {
            int value = 1000_000 + (int) Math.round(1000_000 * Math.random());
            ticketNumbers[i] = value;
            if (i % 100 == 0) {
                winTickets[i / 100] = value;
            }
        }
        for (int i = 0; i < ticketNumbers.length; i++) {
            System.out.println(i + ": " + ticketNumbers[i]);
        }
        System.out.println(Arrays.toString(winTickets));
        System.out.println("********************************************");

        for (String s : "Каждый охотник желает знать, где сидит фазан".split(",?\\s+")) {
            System.out.println(s);
        }
        System.out.println("********************************************");

        String[] arr = "Каждый каждый охотник желает знать знать знать, где сидит фазан фазан".split(",?\\s+");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1 || !(arr[i].equalsIgnoreCase(arr[i + 1]))) {
                System.out.println(arr[i]);
            }
        }

    }
}
