package Codewars;

import java.util.Scanner;

/**
 * Problem : Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this
 * way until a single-digit number is produced. The input will be a non-negative integer.
 *
 * Examples :  16  -->  1 + 6 = 7
 *             942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
 *             132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
 *             493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
 */
public class SumOfDigits {

    private static int sumOfNumbers(int n) {
        String str = String.valueOf(n);
        char[] strToArray = str.toCharArray();

        int sum = 0;
        for(char ch:strToArray) {
            int chToInt = Integer.parseInt(String.valueOf(ch));
            sum += chToInt;
        }

        String checkStr = String.valueOf(sum);
        if(checkStr.length() > 1) {
            return sumOfNumbers(sum);
        }else {
            return sum;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = sumOfNumbers(n);

        System.out.println(result);
    }

}
