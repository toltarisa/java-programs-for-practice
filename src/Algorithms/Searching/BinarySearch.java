package Algorithms.Searching;

public class BinarySearch {

    static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (target < array[middle])
                right = middle - 1;
            else if (target > array[middle])
                left = middle + 1;
            else
                return middle;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2,5,6,7,11,15,22,45,48,54,61,65,68,76};
        int target = 54;
        int result = binarySearch(array, target);
        System.out.println(result);
    }
}
