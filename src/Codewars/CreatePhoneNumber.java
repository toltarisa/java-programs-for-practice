package Codewars;

import java.util.Arrays;

/**
 * Write a function that accepts an array of 10 integers (between 0 and 9),
 * that returns a string of those numbers in the form of a phone number.
 */
public class CreatePhoneNumber {

    /* First Solution, so much thinking ... */
    public static String createPhoneNumber(int[] numbers) {

        String[] firstThreeNumber = Arrays.stream(numbers, 0, 3)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        String[] middleThreeNumber = Arrays.stream(numbers, 3, 6)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        String[] lastFourNumber = Arrays.stream(numbers, 6, 10)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        String first = String.join("",Arrays.asList(firstThreeNumber));
        String second = String.join("",Arrays.asList(middleThreeNumber));
        String third = String.join("",Arrays.asList(lastFourNumber));

        return String.format("(%s) %s-%s", first, second, third);
    }

    /* Simple Solution, think simple ...

       public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
       }
    */


    public static void main(String[] args) {
        String result = createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        System.out.println(result);
    }
}
