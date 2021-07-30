package Patterns;

import java.util.Scanner;

/*
    Pattern:
    *********
     *******
      *****
       ***
        *

 */
public class Pattern6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows needed to print the pattern ");
        int rows = scanner.nextInt();

        for(int i = rows; i>=1; i--) {

            for(int j = 1; j <= (i * 2) -1; j++ ) {
                System.out.print("*");
            }

            System.out.println();

            for(int k = rows; k >= i; k--) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}
