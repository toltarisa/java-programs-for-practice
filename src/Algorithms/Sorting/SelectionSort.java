package Algorithms.Sorting;

import java.util.Arrays;

public class SelectionSort {

    static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }

            swap(arr, i, min_idx);
        }

        return arr;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 9, 3, 6, 2};
        int[] result = selectionSort(numbers);

        System.out.println(Arrays.toString(result));
    }
}
