package Algorithms.Sorting;

import java.util.Arrays;

public class InsertionSort {

    static int[] insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j> 0 && (arr[j - 1] > arr[j])) {
                swap(arr, j - 1, j);
                j--;
            }
        }

        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 12, 7, 25, 6, 2, 1};
        int[] result = insertionSort(numbers);

        System.out.println(Arrays.toString(result));
    }
}
