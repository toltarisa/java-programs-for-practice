package Array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Write a Java program to convert an ArrayList to an array.
 */
public class ArrayListToArray {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Strawberry");

        list.add("Peach");

        list.add("Grape");

        list.add("Banana");

        list.add("Cherry");

        list.add("Pear");

        String[]  array = new String[list.size()];

        list.toArray(array);

        for (String  string : array)
        {
            System.out.println(string);
        }
        System.out.println(Arrays.toString(array));
    }
}
