package Array;


import java.util.Arrays;

/**
 * Write a Java program to reverse an array of integer values
 */
public class ReverseArray {

    public static void main(String[] args) {
        int[] arrayOfNumbers = {45,23,51,42,73,24,37,63,65};
        int[] reversedArray = new int[arrayOfNumbers.length];

        int index = 0;
        for(int i = arrayOfNumbers.length-1; i>0;i--) {
            reversedArray[index] = arrayOfNumbers[i];
            index++;
        }

        System.out.println(Arrays.toString(reversedArray));

    }
}
