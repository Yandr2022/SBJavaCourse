package Part1.module5_ArraysAndCollections.lesson5_HomeWork.task3;

import java.util.Arrays;

public class PrintExperiments {

    public static void main(String[] args) {

        String[][] cross = new String[7][7];

        for (int i = 0; i < cross.length; i++) {
            for (int j = 0; j < cross[i].length; j++) {
                cross[i][j] = j == i || j == cross[i].length - 1 - i ? "X" : " ";
            }
        }

        for (String[] s : cross
        ) {
            System.out.println(Arrays.toString(s));
        }
        
    }
}
