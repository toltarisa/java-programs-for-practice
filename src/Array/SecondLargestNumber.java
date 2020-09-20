package Array;

import java.util.Arrays;

/**
 * Write a Java program to find the second largest element in an array
 */
public class SecondLargestNumber {

    public static void main(String[] args) {
        int [] arrayOfNumbers = {12,42,51,62,73,46,27,18};
        int length = arrayOfNumbers.length;

        for(int i =0; i< length-1; i++) {
            for(int j = 0; j< length -i -1;j++) {
                if(arrayOfNumbers[j] < arrayOfNumbers[j+1]) {
                    int temp = arrayOfNumbers[j];
                    arrayOfNumbers[j] = arrayOfNumbers[j+1];
                    arrayOfNumbers[j+1] = temp;
                }
            }
        }

        int secondLargestNumber = arrayOfNumbers[1];
        System.out.println("Second largest number " +secondLargestNumber);

    }


}
