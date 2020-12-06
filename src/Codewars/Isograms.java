package Codewars;

import java.util.HashMap;
import java.util.Map;

public class Isograms {
    public static boolean  isIsogram(String str) {

        Map<Character,Integer> wordMap = new HashMap<>();
        String lowerStr = str.toLowerCase();

        for(int i = 0; i<lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);
            Integer value = wordMap.get(ch);

            if(value != null) {
                wordMap.put(ch, value + 1);
            }else {
                wordMap.put(ch,1);
            }
        }

        for(Integer frequency:wordMap.values()) {
            if(frequency > 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String test = "moOse";
        boolean result = isIsogram(test);

        System.out.println(result);
    }
}
