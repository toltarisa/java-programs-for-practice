package Array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Write a Java program to convert an array to ArrayList.
 */
public class ArrayToArrayList {

    public static void main(String[] args) {
        String [] names = new String[] {"John","Dylan","Betty","Stella","Mike","Chuck","Nolan","Margot"};
        ArrayList<String> nameList = new ArrayList<String>(Arrays.asList(names));

        System.out.println(nameList.toString());
    }

}
