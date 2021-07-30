package Patterns;

import java.util.Scanner;

/*
    Pattern:
    *****
    ****
    ***
    **
    *

 */
public class Pattern3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows needed to print the pattern ");
        int rows = scanner.nextInt();

        for(int i = 1; i <=rows; i++) {

            for(int k = rows; k >= i; k--) {
                System.out.print("*");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        scanner.close();
    }
}
