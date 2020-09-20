package Array;

/**
 * Write a Java program to find the maximum and minimum value of an array.
 */
public class MinAndMaxOfArray {

    public static void main(String[] args) {
        int[] arrayOfNumbers = {45,23,51,42,73,24,37,63,65};

        int min = arrayOfNumbers[0];
        int max = arrayOfNumbers[0];
        for(int i=1 ;i<arrayOfNumbers.length; i++) {
            if(arrayOfNumbers[i] < min) {
                min = arrayOfNumbers[i];
            }

            if(arrayOfNumbers[i] > max) {
                max = arrayOfNumbers[i];
            }
        }

        System.out.println("Minimum number is : "+min);
        System.out.println("Maximum number is : "+max);
    }
}
