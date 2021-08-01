package Algorithms.Sorting;


import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] A, int low, int high) {
        if(A == null || A.length == 0)
            return;

        if(low > high)
            return;

        int pivot = A[low + (high - low)/2];

        int i = low, j = high;

        while(i <= j) {

            while(A[i] < pivot) {
                i++;
            }

            while(A[j] > pivot) {
                j--;
            }

            if(i <= j) {
                swap(A, i, j);
                i++;
                j--;
            }
        }

        if(low < j)
            quickSort(A, low, j);
        if(high > i)
            quickSort(A, i, high);
    }

    private static void swap(int[] a, int i, int j) {

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {

        int[] A = { 12, 13, 24, 10, 3, 6, 90, 70 };

        System.out.println(Arrays.toString(A));

        quickSort(A, 0, A.length - 1);

        System.out.println(Arrays.toString(A));

    }
}
