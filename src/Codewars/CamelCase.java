package Codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelCase {

    public static String camelCase(String str) {

       return (str == null || str.isEmpty())?"": Arrays.stream(str.trim().split("\\s+"))
                .map(s -> s.substring(0,1).toUpperCase()+s.substring(1,s.length()))
                .collect(Collectors.joining());

    }

    public static void main(String[] args) {
        String test = "ab  c";
        String result = camelCase(test);

        System.out.println(result);
    }
}
