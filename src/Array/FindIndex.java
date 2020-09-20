package Array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Write a Java program to find the index of an array element.
 */
public class FindIndex {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(20,14,74,3,47,84,21));

        int lookingFor = 47;
        int index = 0;
        for(Integer element:list) {
            if (element == lookingFor) {
                index = list.indexOf(element);
            }
        }

        System.out.println(index);
    }
}
