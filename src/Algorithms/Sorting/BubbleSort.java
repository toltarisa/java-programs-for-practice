package Algorithms.Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }

        return arr;
    }

    static void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,24,6,2,71,4,7,15};
        int [] result = bubbleSort(arr);

        System.out.println(Arrays.toString(result));
    }
}
