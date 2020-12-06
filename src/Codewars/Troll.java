package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Troll {

    public static String disemvowel(String str) {
        Character[] vowels = {'a','e','i','o','u','A','E','I','U','O'};

        List<Character> vowelsList = Arrays.asList(vowels);

        List<Character> charList = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            if(!vowelsList.contains(ch))
                charList.add(ch);
        }

        StringBuilder sb = new StringBuilder();

        for (Character ch : charList) {
            sb.append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String testStr = "Hello my name is isa toltar, this is a test string LOL!";
        String result = disemvowel(testStr);

        System.out.println(result);
    }
}
