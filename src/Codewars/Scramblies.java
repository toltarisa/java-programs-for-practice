package Codewars;

import java.util.*;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {

        Map<Character,Integer> randomMap = countLetters(str1);
        Map<Character, Integer> wordMap = countLetters(str2);

        for(Character c: wordMap.keySet()) {
            Integer count = randomMap.get(c);

            if(count == null || count < wordMap.get(c))
                return false;
        }

        return true;
    }

    public static Map<Character,Integer> countLetters(String str) {

        Map<Character,Integer> randomMap = new HashMap<>();

        for(int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            Integer value = randomMap.get(ch);

            if(value == null) {
                randomMap.put(ch,1);
            }else {
                randomMap.put(ch, value + 1);
            }
        }

        return randomMap;
    }

    public static void main(String[] args) {
        String string = "javscripts";
        String subString = "javascript";
        Boolean result = scramble(string, subString);

        System.out.println(result);
    }
}
