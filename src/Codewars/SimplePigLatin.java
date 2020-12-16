package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimplePigLatin {

    public static String pigIt(String str) {

        if(str.length() == 0)return "";
        if(str.length() == 1)return str.concat("ay");


        List<String> words = Arrays.asList(str.split(" "));
        List<String> modifiedWords = new ArrayList<>();

        words.forEach(word -> {
            String firstLetter = "";

            if (word.matches("[^a-zA-Z0-9]") && word.length() == 1)
                firstLetter = word.substring(0, 1);
            else
                firstLetter = word.substring(0, 1).concat("ay");

            String newString = word.substring(1).concat(firstLetter);
            modifiedWords.add(newString);
        });

        return String.join(" ",modifiedWords);
    }

    public static void main(String[] args) {
        String testCase = "O tempora o mores !";
        String result = pigIt(testCase);

        System.out.println(result);
    }
}
