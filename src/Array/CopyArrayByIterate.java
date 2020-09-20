package Array;

import java.util.Arrays;

/**
 *  Write a Java program to copy an array by iterating the array
 */
public class CopyArrayByIterate {

    public static void main(String[] args) {
        int [] arrayOfNumbers = {12,42,51,62,73,46,27,18};

        int [] arrayToCopy = new int[arrayOfNumbers.length];

        for(int i =0; i<arrayOfNumbers.length; i++) {
            arrayToCopy[i] = arrayOfNumbers[i];
        }

        System.out.println(Arrays.toString(arrayToCopy));
    }
}
