package Codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StockList {

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {

        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0)
            return "";

        Map<String, Integer> stockMap = new HashMap<>();

        Arrays.stream(lstOfArt).forEach(s -> {

            String key = s.split(" ")[0].substring(0, 1);
            String value = s.split(" ")[1];

            Integer stockValue = stockMap.get(key);

            if (stockValue != null)
                stockMap.put(key, stockValue + Integer.parseInt(value));
            else
                stockMap.put(key, Integer.parseInt(value));
        });

        StringBuilder sb = new StringBuilder();

        for (String letter : lstOf1stLetter) {

            Integer value = stockMap.get(letter);

            if (value == null)
                value = 0;

            String part = String.format("(%s : %d)", letter, value);

            String lastElement = lstOf1stLetter[lstOf1stLetter.length - 1];

            if (lastElement.equals(letter))
                sb.append(part);
            else
                sb.append(part).append(" - ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String[] L = {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"};
        String[] M = {"A", "B", "C", "W"};

        String result = stockSummary(L, M);
        System.out.println(result);
    }
}
