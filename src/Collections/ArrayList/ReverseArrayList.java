package Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        List<String> reversedList = new ArrayList<>();
        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        System.out.println("Normal List : "+colors);

        for(int i = colors.size()-1;i>=0;i--) {
            reversedList.add(colors.get(i));
        }
        System.out.println("Reversed List : "+reversedList);
    }
}
