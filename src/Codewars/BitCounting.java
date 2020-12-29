package Codewars;

/**
 * Write a function that takes an integer as input, and returns the number of bits
 * that are equal to one in the binary representation of that number.
 * You can guarantee that input is non-negative.
 */

public class BitCounting {

    public static int countBits(int n){
        String binaryStr = Integer.toBinaryString(n);
        int counter = 0;
        for(int i=0; i<binaryStr.length(); i++) {
            if(Character.getNumericValue(binaryStr.charAt(i)) == 1)
                counter++;
        }

        return counter;
    }

    public static void main(String[] args) {
        int testCase = 1234;
        Integer countOfOnes = countBits(testCase);
        System.out.println(String.format("Count of 1 is %d",countOfOnes));
    }
}
