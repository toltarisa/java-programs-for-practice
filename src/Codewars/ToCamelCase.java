package Codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ToCamelCase {

    static String toCamelCase(String s){
        if(s == null || s.isEmpty()) return "";

        String result =  Arrays.stream(s.split("[-\\_]"))
                .map(str -> str.substring(0,1).toUpperCase() + str.substring(1,str.length()))
                .collect(Collectors.joining());

        if(s.substring(0,1).equals(s.substring(0,1).toLowerCase()))
            return result.substring(0,1).toLowerCase() + result.substring(1, result.length());

        return result;
    }

    public static void main(String[] args) {
        String input = "The-Stealth-Warrior";
        String result = toCamelCase(input);

        System.out.println(result);
    }
}
