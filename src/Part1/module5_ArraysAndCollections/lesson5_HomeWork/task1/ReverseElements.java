package Part1.module5_ArraysAndCollections.lesson5_HomeWork.task1;

import java.util.Arrays;

public class ReverseElements {

    public static void main(String[] args) {

        String[] arr = "Каждый охотник желает знать, где сидит фазан".split("(,)?\\s+");
        System.out.println(Arrays.toString(arr));
        String temp;

        for (int i = 0, j = arr.length - 1; i < arr.length/2; i++,j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            }
        System.out.println(Arrays.toString(arr));


    }
    }

