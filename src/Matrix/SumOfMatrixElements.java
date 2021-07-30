package Matrix;

import java.util.Scanner;

/**
 * Klavyeden girilen NxN tipindeki A matrisinin baştan bir sonraki sütun ve
 * sondan bir önceki satır  elemanların  toplamını hesaplayan programı yazın.
 */
public class SumOfMatrixElements {

    public static void main(String[] args) {

        int satir ,sutun;
        Scanner sc = new Scanner(System.in);
        System.out.println("Satir sayisini gir : ");
        satir = sc.nextInt();
        System.out.println("Sütun sayisini gir : ");
        sutun = sc.nextInt();

        int[][] matrix = new int[satir][sutun];

        System.out.println("Matrix elemanlarını doldur : ");
        for(int i = 0; i< satir; i++) {
            for(int j = 0; j< sutun; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Doldurulan matrix : ");
        for(int i = 0; i < satir; i++) {
            for(int j = 0; j < sutun; j++ ) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("baştan bir sonraki sütun ve sondan bir önceki satır  elemanların  toplamı");
        int satirToplam = 0;
        for(int i = 0; i< satir; i++) {
            for(int j = 0; j< sutun; j++) {
                if((j == 1 && i!= satir - 1) || (i == satir - 2 && j!= 0) )
                   satirToplam += matrix[i][j];
            }
        }
        System.out.println(satirToplam);

        System.out.println("sondan bir önceki satır ve sütundaki elemanların toplamını hesaplayan");
        int satirSutunToplam = 0;
        for(int i = 0; i< satir; i++) {
            for(int j = 0; j< sutun; j++) {
                if((j == sutun - 2 && i!= satir -1 ) || (i == satir - 2 && j != sutun - 1) )
                    satirSutunToplam += matrix[i][j];
            }
        }
        System.out.println(satirSutunToplam);
    }
}