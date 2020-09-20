package Array;

/**
 * Write a Java program to find all pairs of elements in an array whose sum is equal
 * to a specified number.
 */
public class SumOfElementsEqualsToTarget {

    public static void main(String[] args) {
        int [] arrayOfNumbers = {25,20,15,73,84,14,62,73,81,97,36,9};
        int target = 45;
        int length = arrayOfNumbers.length;

        for(int i =0; i<length; i++) {
            for(int j=i+1; j<length; j++) {
                if(arrayOfNumbers[i]+arrayOfNumbers[j] == target) {
                    System.out.println(String.format("indexes that equals to target is [%d,%d] ",i,j));
                }
            }
        }
    }
}
