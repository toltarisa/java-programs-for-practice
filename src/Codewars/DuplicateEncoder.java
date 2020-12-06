package Codewars;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {

    static String encode(String word){
        Map<Character,Integer> wordMap = new HashMap<>();
        String lowerWord = word.toLowerCase();

        for(int i = 0; i<lowerWord.length(); i++) {
            char ch = lowerWord.charAt(i);
            Integer value = wordMap.get(ch);

            if(value != null) {
               wordMap.put(ch, value + 1);
            }else {
                wordMap.put(ch,1);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<lowerWord.length(); i++) {
            Integer count = wordMap.get(lowerWord.charAt(i));

            if(count > 1)
                sb.append(')');
            else
                sb.append('(');
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String test = "Prespecialized";
        String result = encode(test);

        System.out.println(result);
    }
}
