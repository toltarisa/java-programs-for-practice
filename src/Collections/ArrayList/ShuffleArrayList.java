package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShuffleArrayList {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        System.out.println("Before Shuffling : "+colors);

        Collections.shuffle(colors);
        System.out.println("Shuffled List : "+colors);
    }
}
