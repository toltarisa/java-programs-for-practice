import java.util.Scanner;

public class NestedLoopsPattern {

    public static void main(String[] args) {

        /**
         *              *
         *              **
         *              ***
         *              **** // Eğer 4 girilirse en ortada max girilen sayı olacak.Girilen değere göre pattern değişecek
         *              ***
         *              **
         *              *
         *
         */

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int numOfStars = sc.nextInt();

        for (int i = 1; i<=numOfStars;i++) {
            for (int j = 0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = numOfStars-1; i>0;i--) {
            for (int j = 0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
