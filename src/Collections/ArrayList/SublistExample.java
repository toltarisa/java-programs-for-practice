package Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SublistExample {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println("Default List : "+colors);
        List<String> subList = colors.subList(0,3);
        System.out.println("Sub List : "+subList);
    }
}
