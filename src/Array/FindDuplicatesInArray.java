package Array;

/**
 * Write a Java program to find the duplicate values of an array of integer values
 */
public class FindDuplicatesInArray {

    public static void main(String[] args) {
        int[] arrayOfNumbers = {45,23,51,42,73,24,37,63,65,51,45,23};


        for (int i = 0; i < arrayOfNumbers.length-1; i++)
        {
            for (int j = i+1; j < arrayOfNumbers.length; j++)
            {
                if ((arrayOfNumbers[i] == arrayOfNumbers[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+arrayOfNumbers[j]);
                }
            }
        }

    }
}
