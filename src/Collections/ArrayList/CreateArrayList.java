package Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to create a new array list, add some colors (string) and print out the collection
 */
public class CreateArrayList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        for(String color:colors) {
            System.out.println(color);
        }
    }
}
