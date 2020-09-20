package Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a Java program to insert an element (specific position) into an array
 */
public class InsertIndex {

    public static void main(String[] args) {
        int [] arrayOfNumbers = {25,62,15,73,84,36};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter position to insert");
        int index = sc.nextInt();
        System.out.println("Enter number to insert");
        int element = sc.nextInt();

        for(int i = arrayOfNumbers.length -1; i>index; i--) {
            arrayOfNumbers[i] = arrayOfNumbers[i-1];
        }

        arrayOfNumbers[index] = element;

        System.out.println(Arrays.toString(arrayOfNumbers));

    }
}
