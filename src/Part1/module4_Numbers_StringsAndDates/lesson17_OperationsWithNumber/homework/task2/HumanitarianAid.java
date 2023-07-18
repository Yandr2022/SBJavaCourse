package Part1.module4_Numbers_StringsAndDates.lesson17_OperationsWithNumber.homework.task2;

import java.util.Scanner;

public class HumanitarianAid {
    public static void main(String[] args) {

        int truckCapacity = 12;
        int containerCapacity = 27;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input amount of boxes");
        int boxesAmount = scanner.nextInt();
        int cargo = 0, container = 0;

        for (int i = 1; i <= boxesAmount; i++) {
            System.out.println("Truck " + ++cargo + ":");
            for (int j = 1; j <= truckCapacity && i <= boxesAmount; j++) {
                System.out.println("\tContainer " + ++container + ":");
                for (int k = 1; k <= containerCapacity && i <= boxesAmount; k++) {
                    System.out.println("\t\tBox " + i++ + ":");
                }
            }
        }

        System.out.println("Trucks: " + cargo);
        System.out.println("Containers: " + container);
    }
}
