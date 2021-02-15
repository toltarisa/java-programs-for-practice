package Codewars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StopSpinning {

    public static String spinWords(String sentence) {

        List<String> words = Arrays.asList(sentence.split(" "));

        return words.stream()
                .map(word -> {
                  if(word.length() >= 5) {
                      word = reverseString(word);
                  }
                  return word;
                }).collect(Collectors.joining(" "));
    }

    public static String reverseString (String value) {
        char[] letters = new char[value.length()];

        int letterIndex = 0;
        for (int i = value.length() -1 ; i >= 0; i--) {
            letters[letterIndex] = value.charAt(i);
            letterIndex++;
        }

        String reversedString = "";

        for (int i = 0 ; i < value.length(); i++) {
            reversedString += letters[i];
        }
        return reversedString;
    }

    public static void main(String[] args) {
        String test = "Just gniddik ereht is llits";
        String result = spinWords(test);

        System.out.println(result);
    }
}
