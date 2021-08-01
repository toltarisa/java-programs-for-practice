package Algorithms.Searching;

public class LinearSearch {

    public static int search(int[] arr, int target) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if (arr[i] == target)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 12, 53, 76, 2, 5};
        int target = 12;

        int result = search(arr, target);

        if (result == -1)
            System.out.println("target element : " + target + "is not found in array");
        else
            System.out.println("Target element index is : " + result);
    }
}
