package Part1.module5_ArraysAndCollections.lesson4_MultidimensionArray;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        int[][] studentMarks = {
                {5, 6, 2, 7, 8, 9}
                , {3, 5, 4, 6, 9, 2, 0, 1, 8}
                , {8, 9, 7, 9, 8, 5}
                , {5, 2, 3}};

        for (int i = 0; i < studentMarks.length; i++) {
            System.out.println("Student #" + (i + 1) + " marks:");
            for (int j = 0; j < studentMarks[i].length; j++) {
                System.out.println("\t" + studentMarks[i][j]);
            }
        }
        System.out.println("*******************************");

        int i = 1;
        for (int[] marks : studentMarks) {
            System.out.println("Student #" + i++ + " marks: " + Arrays.toString(marks));

        }
    }
}
