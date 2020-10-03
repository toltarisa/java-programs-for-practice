package Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class JoinTwoArrayList {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        List<String> cars = new ArrayList<>();

        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        cars.add("Audi");
        cars.add("Toyota");
        cars.add("Ford");
        cars.add("Tesla");
        cars.add("Chevy");
        cars.add("Mercedes");

        ArrayList<String> joinedList = new ArrayList<String>();
        joinedList.addAll(colors);
        joinedList.addAll(cars);
        System.out.println("New array: " + joinedList);
    }
}
