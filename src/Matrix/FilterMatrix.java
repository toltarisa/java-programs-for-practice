package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class FilterMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] matrix = new int[5][4];

        System.out.println("Matrixi doldur : ");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 4; j++ ) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrixi doldur : ");
        for(int row = 0; row < 5; row++) {
            for(int col = 0; col < 4; col++ ) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }

        System.out.println("Her satırdaki en büyük sayıyı buyuk dizisine yaz : ");
        int[] buyuk = new int[5];
        for(int row = 0; row < 5; row++) {
            for(int col = 0; col < 4; col++ ) {
                if (buyuk[row] < matrix[row][col]) {
                    buyuk[row] = matrix[row][col];
                }
            }
        }

        System.out.println(Arrays.toString(buyuk));

        System.out.println("Her sutundaki en kucuk sayıyı kucuk dizisine yaz : ");
        int[] kucuk = new int[4];
        int counter = 0;
        for(int row = 0; row < 4; row++) {
            int min = matrix[0][row];
            for(int col = 1; col < 4; col++) {
                if(matrix[col][row] < min) {
                    min = matrix[col][row];
                }
            }
            kucuk[counter++] = min;
        }

        System.out.println(Arrays.toString(kucuk));
    }
}
