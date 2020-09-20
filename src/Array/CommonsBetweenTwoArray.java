package Array;

import java.util.HashSet;

/**
 * Write a Java program to find the common elements between two arrays (string values)
 */
public class CommonsBetweenTwoArray {

    public static void main(String[] args) {
        String [] array1 = {"Apple","Orange","Banana","Peach","Pear"};

        String [] array2 = {"Orange","Melon","Strawberry","Peach"};
        HashSet<String> commonFruits = new HashSet<String>();

        for (String value : array1) {
            for (String s : array2) {
                if (value.equals(s)) {
                    commonFruits.add(value);
                }
            }
        }

        System.out.println("Common elements are "+commonFruits.toString());
    }
}
