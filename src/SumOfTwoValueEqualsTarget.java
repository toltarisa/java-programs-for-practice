import java.util.Arrays;

public class SumOfTwoValueEqualsTarget {

    public static int[] twoNumbers(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while(left < right) {

            int sum = arr[left] + arr[right];

            if(sum == target)
                return new int[]{left, right};

            if(sum > target)
                right--;

            if(sum < target)
                left++;
        }

        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] arr = {-1,1,2,3,5};
        int[] result = twoNumbers(arr, 5);

        System.out.println(Arrays.toString(result));
    }
}
