package Array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class ArrayAverage {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(12,24,74,64,19,54,28,45));

        int length = listOfNumbers.size();
        int sum = 0;

        for (Integer listOfNumber : listOfNumbers) {
            sum += listOfNumber;
        }

        int average = sum/length;

        System.out.println(average);
    }
}
