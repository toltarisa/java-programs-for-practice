package Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class InsertBeginningOfList {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println("Before Inserting : "+colors);

        colors.add(0,"Purple");

        System.out.println("After Inserting to beginning : "+colors);
    }
}
